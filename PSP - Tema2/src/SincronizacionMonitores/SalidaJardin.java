/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SincronizacionMonitores;

/**
 *
 * @author FP
 */
public class SalidaJardin extends Thread{
    //clase derivada de Thread que define un hilo
    private RecursoJardin jardin;

    public SalidaJardin(String nombre, RecursoJardin j) {
        this.setName(nombre);
        this.jardin = j;
    }
    
    @Override
    public void run(){
        jardin.decrementaCuenta();//invoca al método que decrementa la cuenta de acceso al jardin
    }
    
    
}
