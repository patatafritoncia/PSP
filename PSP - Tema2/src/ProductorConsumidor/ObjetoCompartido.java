/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductorConsumidor;

/**
 *
 * @author FP
 */
public class ObjetoCompartido {

    int valor;
    boolean disponible = false;  //Inicialmente no tenemos valor

    public synchronized int get() {
        // MIENTRAS NO TENGAMOS DATOS DISPONIBLES ESPERAMOS
        while (disponible == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        this.disponible = false;
        notifyAll();
        return this.valor;
    }

    public synchronized void set(int val) {
        while (disponible == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        this.valor = val;
        this.disponible = true;
        notifyAll();
        
        
        
        
    }
}
