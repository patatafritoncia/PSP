/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CenaFilosofos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author FP
 */
public class Filosofo extends Thread {
    
    private int id;
    private Semaphore leftFork, rightFork;
    
    public Filosofo(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            while (true) {
                //Fil�sofo piensa
                System.out.println("Fil�foso " + id + " est� pensando.");

                // Fil�sofo intenta adquirir el tenedor izquierdo
                leftFork.acquire();
                System.out.println("Fil�sofo " + id + " ha tomado " + "el tenedor izquierdo");

                // Fil�sofo intenta adquirir el tenedor derecho
                rightFork.acquire();
                System.out.println("Fil�sofo " + id + " ha tomado " + "el tenedor derecho");

                // fil�sofo come
                System.out.println("Filosofo " + id + " esta comiendo.");

                // Filosofo suelta el tenedor izquierdo
                leftFork.release();
                System.out.println("Fil�sofo " + id + " ha soltado " + "el tenedor izquierdo");
                
                //Filosofo suelta el tenedor derecho
                rightFork.release();
                System.out.println("Fil�sofo " + id + " ha soltado " + "el tenedor derecho");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
