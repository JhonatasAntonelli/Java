/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomasistemaoperacional;

import java.util.Locale;

/**
 *
 * @author jonat
 */
public class IdiomaSistemaOperacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Locale idioma = new Locale ();
        Locale loc = Locale.getDefault();
        String idioma = loc.getDisplayLanguage();
        System.out.println("O idioma desse computador é " +idioma);
        
    }
    
}
