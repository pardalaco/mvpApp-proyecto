/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automatizacion;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class boton {
    public static void pboton(JPanel actual, JPanel siguiente){
        
        siguiente.setSize(280, 470);
        siguiente.setLocation(0, 0);
        
        actual.removeAll();
        actual.add(siguiente, BorderLayout.CENTER );
        actual.revalidate();
        actual.repaint(); 
    }

}

