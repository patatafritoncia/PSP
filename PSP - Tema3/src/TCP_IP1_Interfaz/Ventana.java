/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP_IP1_Interfaz;

import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import javax.swing.*;
import java.net.UnknownHostException;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea area = new JTextArea();
    JTextField direccion_web;
    String enviarDireccion;

    public Ventana() {
        frame.setVisible(true);
        frame.setSize(700, 700);
        frame.setTitle("Interfaz TCP/IP");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 200);
        frame.getContentPane().setBackground(Color.red);

        Panel();
        DireccionWeb();
        Boton();

    }

    public void Panel() {
        panel.setBackground(Color.pink); // poner color a panel
        panel.setMaximumSize(new Dimension(700, 700)); //Tamaño maximo del panel
        panel.setMinimumSize(new Dimension(700, 700)); //Tamaño mínimo del panel
        panel.setLayout(null);// desactiva el layout por defecto 

        frame.add(panel); //para añadir unelemento a otro, en este caso panel sobre ventana
    }

    public void DireccionWeb() {
        direccion_web = new JTextField();
        direccion_web.setBounds(160, 60, 280, 50);
        direccion_web.setForeground(Color.black);
        direccion_web.setBackground(Color.white);
        direccion_web.setHorizontalAlignment(SwingConstants.LEFT);
        direccion_web.setFont(new Font("Calibri", Font.BOLD, 25));

        panel.add(direccion_web);
    }

    public void Boton() {
        JButton boton = new JButton(); //Objeto tipo JButton, boton
        panel.add(boton);
        boton.setBounds(50, 120, 390, 50);
        boton.setText("ENVIAR");
        boton.setForeground(Color.black);
        boton.setBackground(Color.white);
        boton.setFont(new Font("Calibri", Font.BOLD, 25));

        JLabel respuesta = new JLabel();
        area.add(respuesta);

        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarDireccion = direccion_web.getText();
                respuesta.setBounds(50, 180, 390, 50);
                respuesta.setText(direccion_web.getText());
                panel.add(respuesta);

                InetAddress dir = null;

                try {
                    //LOCALHOST
                    System.out.println("==================================");
                    System.out.println("SALIDA PARA LOCALHOST");
                    dir = InetAddress.getByName("localhost");
                    pruebaMetodos(dir);

                    //URL google.es
                    System.out.println("==================================");
                    System.out.println("SALIDA PARA LOCALHOST");
                    dir = InetAddress.getByName(enviarDireccion);
                    pruebaMetodos(dir);

                } catch (UnknownHostException e1) {
                    e1.printStackTrace();
                    e1.getMessage();
                }

            }

            public static void pruebaMetodos(InetAddress dir) {
                System.out.println("\tMétodo getLocalhost(): " + dir);
                InetAddress dir2;

                try {
                    dir2 = InetAddress.getLocalHost();
                    System.out.println("\tMétodo getLocalHost(): " + dir2);
                } catch (UnknownHostException e1) {
                    e1.printStackTrace();
                    e1.getMessage();
                }

                //Usamos métodos de la clase
                System.out.println("\tMétodo getHostName(): " + dir.getHostName());
                System.out.println("\tMétodo getHostAdress(): " + dir.getHostAddress());
                System.out.println("\tMétodo toString():  " + dir.toString());
                System.out.println("\tMétodo getCannonicalHostName(): " + dir.getCanonicalHostName());
            }

        };

    boton.addActionListener (pulsar); // das a enter y sale el mensaje
    // boton.addActionListener(pulsar); // sale el mensaje cuando pulsas el botn
}

}
