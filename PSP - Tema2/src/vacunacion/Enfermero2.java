/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacunacion;

/**
 *
 * @author FP
 */
public class Enfermero2 extends Thread{
    private String nombre;
    private ListaPaciente lista;
    private long inicio;

    public Enfermero2(String nombre, ListaPaciente lista, long inicio) {
        this.nombre = nombre;
        this.lista = lista;
        this.inicio = inicio;
    }
    

    public ListaPaciente getLista() {
        return lista;
    }

    public long getInicio() {
        return inicio;
    }

    public void setLista(ListaPaciente lista) {
        this.lista = lista;
    }

    public void setInicio(long inicio) {
        this.inicio = inicio;
    }
    
    
    public Enfermero2(String nombre) {
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
    
    @Override
    public void run(){
        System.out.println("El enfermero " + this.nombre + " comienza a vacunar la compra del cliente "
                + lista.getNombre()+ " en el tiempo: " + (System.currentTimeMillis() - inicio) / 1000 + " seg");
        
        for (int i = 0; i < lista.getTiempoPacientes().length; i++) {
            this.tiempoVacunacion(lista.getTiempoPacientes()[i]);
            System.out.println("Vacunando al paciente " + (i + 1) + " --> Tiempo: "
                    + (System.currentTimeMillis() - inicio) / 1000 + " seg");
        }
        
        System.out.println("El enfermero " + this.nombre + " ha terminado "+ lista.getNombre()
                + " en el tiempo: " + (System.currentTimeMillis() - inicio) / 1000 + " seg");
    }
    
        
    
}
