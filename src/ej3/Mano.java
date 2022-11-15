/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.List;

/**
 *
 * @author Maty
 */
public class Mano {
    private List<Carta> barajaMano;

    public Mano() {
    }

    public Mano(List<Carta> barajaMano) {
        this.barajaMano = barajaMano;
    }

    public List<Carta> getBarajaMano() {
        return barajaMano;
    }

    public void setBarajaMano(List<Carta> barajaMano) {
        this.barajaMano = barajaMano;
    }

    @Override
    public String toString() {
        return "Mano{" + "barajaMano=" + barajaMano + '}';
    }
    
}
