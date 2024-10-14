/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package URL_1;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author FP
 */
public class Principal {
    public static void Visualizar(URL url){
        System.out.println("\t URL completa: " + url.toString());
        System.out.println("\t getProtocol(): " + url.getProtocol());
        System.out.println("\t getHost(): " + url.getHost());
        System.out.println("\t getPort(): " + url.getProtocol());
        System.out.println("\t getFile(): " + url.getFile());
        System.out.println("\t getUserInfo(): " + url.getUserInfo());
        System.out.println("\t getPath(): " + url.getPath());
        System.out.println("\t getAuthority(): " + url.getAuthority());
        System.out.println("\t getQuery(): " + url.getQuery());
        System.out.println("\t getDefaultPort(): " + url.getDefaultPort());
        System.out.println("=============================================");
    }
    public static void main(String[] args) {
        URL url;
        
        try{
            System.out.println("Constructor simple para una URL: ");
            url = new URL("http://docs.oracle.com/");
            Visualizar(url);
            
            System.out.println("Constructor simple para una URL: ");
            url = new URL("https://cdmfp.esemtia.net/moodle/my/courses.php");
            Visualizar(url);
            
            System.out.println("Constructor para protocolo + url + directorio: ");
            url = new URL("http","localhost",8080,"/doc/appdev/instalation.html");
            Visualizar(url);
            
            System.out.println("Constructor para un objeto url en un contexto: ");
            URL urlBase = new URL("http://docs.oracle.com/");
            url = new URL(urlBase, "/java/10/docs/api/java/net/URL.html");
            Visualizar(url);
            
        }catch (MalformedURLException e){
            e.getMessage();
            System.out.println("Error al formar la url: " + e);
        }
    }
}
