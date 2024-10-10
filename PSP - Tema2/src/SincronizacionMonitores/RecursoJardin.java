/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SincronizacionMonitores;

/**
 *
 * @author FP
 */
public class RecursoJardin {
    // clase que simula las entradas y salidas al jardin
    private int cuenta; // para contar ñas entradas y salidas
    
    public RecursoJardin(){
        cuenta = 100; // inicialmente hay 100 personas en el jardin
    }
    
    public synchronized void incrementaCuenta(){
        // método que incrementa en 1 la variable cuenta
        System.out.println("hilo " + Thread.currentThread().getName()
        + " --- Entra en el jardín"); // muestra el hilo que entra en el metodo
        
        cuenta++;
        System.out.println(cuenta + " en jardin"); // cuenta cada acceso al jardin y muestra el numero de acceso
        
    }
    
    public synchronized void decrementaCuenta(){
        // método que decrementa en 1 la variable cuenta
        System.out.println("hilo " + Thread.currentThread().getName()
        + " --- Sale en el jardín"); // muestra el hilo que sale en el metodo
        
        cuenta--;
        System.out.println(cuenta + " en jardin"); // cuenta cada acceso al jardin y muestra el numero de acceso
    }
}
