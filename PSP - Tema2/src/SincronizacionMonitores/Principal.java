/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SincronizacionMonitores;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        RecursoJardin jardin = new RecursoJardin(); //crea un objeto RecursoJardin
        
        for (int i = 0; i <= 10; i++) {
            (new EntradaJardin("Entra el " + i, jardin)).start(); // entrada de 10 hilos al jardin
        }
        
        for (int i = 0; i <= 15; i++) {
            (new SalidaJardin("Sale el " + i, jardin)).start(); // entrada de 15 hilos al jardin
        }
        
    }
}
