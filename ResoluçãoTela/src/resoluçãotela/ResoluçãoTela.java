/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resoluçãotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jonat
 */
public class ResoluçãoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();        
        System.out.println("A resolução da tele desse computador é "+d.width + " x " +d.height);
                 
    }
    
}
