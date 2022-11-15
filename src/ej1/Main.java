/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author Maty
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro tito = new Perro("tito", "caniche", 5, 1.5);
        Perro juan = new Perro("juan", "pastor", 6, 1.8);
        
        Duenio lucas = new Duenio("lucas", "vazquez", 35, tito);
        Duenio Fer = new Duenio("Fer", "estres", 24, juan);
        
        System.out.println(lucas);
        System.out.println(Fer);
        
    }
    
}
