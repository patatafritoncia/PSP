/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacunacion;

/**
 *
 * @author FP
 */
public class ListaPaciente {
    private String nombre;
    private int [] tiempoPacientes;
    
    //Constructores, getters y setters

    public ListaPaciente(String nombre, int[] tiempoPacientes) {
        this.nombre = nombre;
        this.tiempoPacientes = tiempoPacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getTiempoPacientes() {
        return tiempoPacientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempoPacientes(int[] tiempoPacientes) {
        this.tiempoPacientes = tiempoPacientes;
    }
    
}
