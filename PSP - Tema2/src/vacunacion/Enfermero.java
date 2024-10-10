/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacunacion;

/**
 *
 * @author FP
 */
public class Enfermero { 
    private String nombre;

    public Enfermero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private void tiempoVacunacion (int segundos){
        try{
            Thread.sleep(segundos * 1000);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    
    public void vacunar(ListaPaciente lista, long timeStamp){
        System.out.println("El enfermero " + this.nombre + " comienza a vacunar la compra del cliente "
                + lista.getNombre()+ " en el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
        
        for (int i = 0; i < lista.getTiempoPacientes().length; i++) {
            this.tiempoVacunacion(lista.getTiempoPacientes()[i]);
            System.out.println("Vacunando al paciente " + (i + 1) + " --> Tiempo: "
                    + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
        }
        
        System.out.println("El enfermero " + this.nombre + " ha terminado "+ lista.getNombre()
                + " en el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
    }
}
