/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SumatorioProcesadores;

import java.util.ArrayList;
import java.util.concurrent.FutureTask;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) {

        // Capturamos los parametros
        Long index1 = 1L;
        Long index2 = 100L;

        try {
            // Particionem el rango de valores en tantos rangos como los procesadores tenemos
            // Calculamos primero la cantidad de procesadores
            Runtime runtime = Runtime.getRuntime();
            int num_procesadores = runtime.availableProcessors();
            System.out.println("Dividiendi la tarea " + num_procesadores + " hilos");
            System.out.println(num_procesadores);

            // Obtencion de los rangos 
            Long incremento = index2 / num_procesadores; // debido a que uno se esta utilizando para ejecutar esto, usamos los libres
            System.out.println(incremento);

            //Creacion del vector de sumas parciales 
            ArrayList<FutureTask<Long>> sumaFuture = new ArrayList<FutureTask<Long>>();

            // Creacion del vector de los hilos
            Thread vectorHilos[] = new Thread[num_procesadores];
            for (int i = 0; i < num_procesadores; i++) {
                // Creamos objeto tipo suma, que es threadable
                long ini = index1 + incremento * i;
                long fin = index1 + incremento * (i + 1) - 1;

                if (fin > index2) {
                    fin = index2;
                }

                // Creamos ahora suma, que es callable
                Suma sumaParcial = new Suma(ini, fin);

                // Y el FutureTask que la encapsula para que sea Runnable
                sumaFuture.add(new FutureTask<Long>(sumaParcial));

                // y creamos y lanzamos el hilo a partir de 1 futureTask
                vectorHilos[i] = new Thread(sumaFuture.get(i));
                vectorHilos[i].setName("Hilo " + i);
                vectorHilos[i].start();
            }
            // Esperemos que terminen todos y va,os añadiendo su valor de retorno acumulado
            long ac = 0;
            for (int i = 0; i < num_procesadores; i++) {
                vectorHilos[i].join();
                ac = ac + sumaFuture.get(i).get();
            }

            System.out.println("Suma total: " + ac);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
