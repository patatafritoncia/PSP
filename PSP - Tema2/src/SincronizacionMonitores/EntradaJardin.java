/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SincronizacionMonitores;

/**
 *
 * @author FP
 */
public class EntradaJardin extends Thread{
    // clase derivada de Thread que define un hilo
    
    private RecursoJardin jardin;
    
    public EntradaJardin(String nombre, RecursoJardin j){
        this.setName(nombre);
        this.jardin = j;
    }
    
    @Override
    public void run(){
            jardin.incrementaCuenta(); // invoca al método que incrementa la cuenta de accesos al jardin

    }
}
