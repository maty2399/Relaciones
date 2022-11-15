/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManosALaObra2;

import java.util.List;

/**
 *
 * @author Maty
 */
public class ObEquipo {
    
    List<ObJugador> jugadores;

    public ObEquipo() {
    }

    public ObEquipo(List<ObJugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<ObJugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<ObJugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "ObEquipo{" + "jugadores=" + jugadores + '}';
    }
    
}
