/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author Maty
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCartas sdc = new ServicioCartas(); //Servicio con el cual crearé el objeto mano, baraja que a su vez contendrá como atributo una lista de clase carta      
        Baraja barajaJugador = sdc.crearBaraja(); //Creo mi objeto baraja que tendrá como atributo una lista de cartas de la clase carta
        Mano manoJugador = sdc.crearMano(); //Creo mi objeto mano que tendrá como atributo una lista de cartas de la clase carta
        sdc.rondaCartas(barajaJugador, manoJugador);
    }
    
}
