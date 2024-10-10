/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductorConsumidor;

/**
 *
 * @author FP
 */
public class Consumidor implements Runnable{
    //Referencia a un objeto compartido
    private ObjetoCompartido compatido;
    
    Consumidor(ObjetoCompartido compartido){
        this.compatido = compartido;
        
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("El consumidor consume: " + this.compatido.get());
            try{
                Thread.currentThread().sleep(100);
            }catch (InterruptedException e){
                e.getMessage();
            }
        }
    }
}
