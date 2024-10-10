/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

/**
 *
 * @author FP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarea tarea = new Tarea();
        Tarea2 tarea2 = new Tarea2();

        try{
            tarea.start();
            tarea.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        
        try{
            tarea2.start();
            tarea2.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        
        System.out.println("Yo soy el programa principal y sigo currando");
        System.out.println("Fin del programa principal");
    }
    
}
