/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManosALaObra2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maty
 */
public class Obra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObJugador jugador1 = new ObJugador("jugador1", "apellido1", "Lateral", 7);
        ObJugador jugador2 = new ObJugador("jugador2", "apellido2", "Mediocampista", 5);
        ObJugador jugador3 = new ObJugador("jugador3", "apellido3", "Arquero", 1);
        
        
        List<ObJugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        
        //Se instancia el equipo
         
        ObEquipo equipo = new ObEquipo();
        equipo.setJugadores(jugadores);
        
        //Recorro el atributo del tipo lista "Jugadores" del objeto equipo 
        
        for (ObJugador jugador : equipo.getJugadores()) {
            System.out.println(jugador);
        }
    }
    
}
