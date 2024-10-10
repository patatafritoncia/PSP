/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjecutarWordyPPT;

/**
 *
 * @author FP
 */
public class EjecutarProceso {
    public void ejecutar (String ruta){
       ProcessBuilder pb;
        try{
            pb = new ProcessBuilder(ruta);
            pb.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        String ruta = "\"C:\\Program Files\\Microsoft Office\\root\\Office16\\POWERPNT.EXE\"";
        String ruta2 = "\"C:\\Program Files\\Microsoft Office\\root\\Office16\\POWERPNT.EXE\"";
        
        EjecutarProceso lp = new EjecutarProceso();
        
        lp.ejecutar(ruta);
        lp.ejecutar(ruta2);
        System.out.println("Finalizado");
        
    }
    
}

