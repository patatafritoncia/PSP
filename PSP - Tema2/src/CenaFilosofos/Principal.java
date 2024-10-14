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
public class Principal {
    public static void main(String[] args) {
        final int numPhilosophers = 5;
        Semaphore [] forks = new Semaphore[numPhilosophers];
        Filosofo[] philosophers = new Filosofo[numPhilosophers];
        
        //Inicializar los tenedores
        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Semaphore(1);
        }
        
        // Crear e inicializar los filosofos
        for (int i = 0; i < numPhilosophers; i++) {
            Semaphore leftFork = forks[i];
            Semaphore rightFork = forks[(i + 1)% numPhilosophers];
            
            // El tenedor derecho es el siguiente tenedor
            philosophers[i] = new Filosofo(i, leftFork, rightFork);
            philosophers[i].start();
            
        }
    }
}
