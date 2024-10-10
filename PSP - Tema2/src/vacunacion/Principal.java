/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacunacion;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        // Creamos las listas
        ListaPaciente lista1 = new ListaPaciente ("pm1", new int []{3,6,10,1,5});
        ListaPaciente lista2 = new ListaPaciente ("pm2", new int []{7,2,1,10,4});
        
        
        long inicio = System.currentTimeMillis();  
        Enfermero2 enf1 = new Enfermero2("Valentino", lista1,inicio);
        Enfermero2 enf2 = new Enfermero2("Pelayo",lista2,inicio);
        
        //Cogemos el tiempo de referencia
                                                                                                                 
        
        //Empezamos a vacunar
        enf1.start();
        enf2.start();
        
    }
}
