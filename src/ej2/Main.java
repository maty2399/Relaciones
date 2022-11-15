/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.List;

/**
 *
 * @author Maty
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioPartidas partidaRuletaRusa = new ServicioPartidas();
       Revolver revolver = partidaRuletaRusa.llenarRevolver();
       List<Jugador> jugadores = partidaRuletaRusa.llenarJugadores();
       Juego juegoRuletaRusa = partidaRuletaRusa.llenarJuego(revolver, jugadores);
       partidaRuletaRusa.ronda(juegoRuletaRusa);  
    }
}
