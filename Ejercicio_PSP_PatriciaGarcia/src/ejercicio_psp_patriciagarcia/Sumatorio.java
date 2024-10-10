/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_psp_patriciagarcia;

/**
 *
 * @author FP
 */
public class Sumatorio extends Thread {
    private double numero;
    private double resultado;

    public double getResultado() {
        return resultado;
    }
    
    
    public Sumatorio(double numero){
        this.numero = numero;
    }
    
    private double calculoImpar(){
        if(numero % 2 == 0){
            numero = numero -1;
        }
        double total = 0;
        for (double i = numero; i >= 1; i = i-2) {
            total += i;
        }
        return total;
    }
    
    
    @Override
    public void run(){
        this.resultado = calculoImpar();
        
    }
    
}
