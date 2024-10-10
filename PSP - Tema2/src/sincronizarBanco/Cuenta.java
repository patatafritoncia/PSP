/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizarBanco;

/**
 *
 * @author FP
 */
public class Cuenta {
    private int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    private void restar (int cantidad){
        saldo = saldo - cantidad;
    }
    
    public synchronized void RetirarDinero (int cant, String nom){
        if(getSaldo()>=cant){
            System.out.println(nom + " SE VA A RETIRAR SALDO (ACTUAL ES: " + getSaldo() + ")");
            try{
                Thread.sleep(500);
            }catch (InterruptedException ex){
                
            }
            restar(cant);
            System.out.println("\t" + nom + " retira => " + cant + " ACTUAL: " + getSaldo()+ ". ");
        }else {
            System.out.println(nom + " No puede retirar dinero, NO HAY SALDO: " + getSaldo() + ". ");
        }
        
        if(getSaldo() < 0){
            System.out.println("SALDO NEGATIVO => "+ getSaldo());
        }
    }
}
