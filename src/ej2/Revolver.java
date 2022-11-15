/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Maty
 */
public class Revolver {
    private int posicionAgua;
    private int posicionDisparo;

    public Revolver() {
    }

    public Revolver(int posicionAgua, int posicionDisparo) {
        this.posicionAgua = posicionAgua;
        this.posicionDisparo = posicionDisparo;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionDisparo() {
        return posicionDisparo;
    }

    public void setPosicionDisparo(int posicionDisparo) {
        this.posicionDisparo = posicionDisparo;
    }

    @Override
    public String toString() {
        return "\n ### El agua estaba en el tambor " + posicionAgua + " y el cañon estaba en el tambor " + posicionDisparo + " ###";
    }
    
    
    
}
