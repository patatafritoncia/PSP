 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TCP_IP1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author FP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InetAddress dir = null;
        
        try{
            //LOCALHOST
            System.out.println("==================================");
            System.out.println("SALIDA PARA LOCALHOST");
            dir = InetAddress.getByName("localhost");
            pruebaMetodos(dir);
            
            //URL google.es
            System.out.println("==================================");
            System.out.println("SALIDA PARA LOCALHOST");
            dir = InetAddress.getByName("google.es");
            pruebaMetodos(dir);
            
        }catch (UnknownHostException e){
            e.printStackTrace();
            e.getMessage();
        }
  
    }
    
    public static void pruebaMetodos(InetAddress dir){
            System.out.println("\tM�todo getLocalhost(): " + dir);
            InetAddress dir2;
            
            try{
                dir2 = InetAddress.getLocalHost();
                System.out.println("\tM�todo getLocalHost(): " + dir2);
            }catch (UnknownHostException e1){
                e1.printStackTrace();
                e1.getMessage();
            }
            
            //Usamos m�todos de la clase
            System.out.println("\tM�todo getHostName(): " + dir.getHostName());
            System.out.println("\tM�todo getHostAdress(): " + dir.getHostAddress());
            System.out.println("\tM�todo toString():  "+  dir.toString());
            System.out.println("\tM�todo getCannonicalHostName(): "+ dir.getCanonicalHostName());
        }
    
}
