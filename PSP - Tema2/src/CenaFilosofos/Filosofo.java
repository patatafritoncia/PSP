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
                //Filósofo piensa
                System.out.println("Filófoso " + id + " está pensando.");

                // Filósofo intenta adquirir el tenedor izquierdo
                leftFork.acquire();
                System.out.println("Filósofo " + id + " ha tomado " + "el tenedor izquierdo");

                // Filósofo intenta adquirir el tenedor derecho
                rightFork.acquire();
                System.out.println("Filósofo " + id + " ha tomado " + "el tenedor derecho");

                // filósofo come
                System.out.println("Filosofo " + id + " esta comiendo.");

                // Filosofo suelta el tenedor izquierdo
                leftFork.release();
                System.out.println("Filósofo " + id + " ha soltado " + "el tenedor izquierdo");
                
                //Filosofo suelta el tenedor derecho
                rightFork.release();
                System.out.println("Filósofo " + id + " ha soltado " + "el tenedor derecho");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
