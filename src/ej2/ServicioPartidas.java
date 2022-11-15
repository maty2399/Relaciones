/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Maty
 */
public class ServicioPartidas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Revolver llenarRevolver(){
        Revolver revolver = new Revolver();
        revolver.setPosicionDisparo((int)(Math.random()*8+1)) ;
        revolver.setPosicionAgua((int)(Math.random()*8+1));
        return revolver;
    }
    
    public List<Jugador> llenarJugadores(){
        List<Jugador> jugadores = new ArrayList<>();
        String nombre = "";
        System.out.println("ingrese los jugadores");
        int cantidad = leer.nextInt();
        if(cantidad > 6){
            cantidad = 6;
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el nombre del jugador" + (i + 1) + ":");
                nombre = leer.next();
                jugadores.add(new Jugador((i + 1), nombre, false));
                
            }
        }else {
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese el nombre del jugador " + (i + 1) + ":");
                nombre = leer.next();
                jugadores.add(new Jugador((i + 1), nombre, false));
            }
        }
        return jugadores;
    }
    
    public Juego llenarJuego(Revolver revolver, List<Jugador>jugadores){
        Juego juego = new Juego();
        juego.setRevolver(revolver);
        juego.setJugadores(jugadores);
        return juego;
    }
    
    public boolean mojar (Juego juego){
        return Objects.equals(juego.getRevolver().getPosicionDisparo(), juego.getRevolver().getPosicionAgua());
    }
    
    public void siguienteTambor(Juego juego){
        if (juego.getRevolver().getPosicionDisparo() > 8){
            juego.getRevolver().setPosicionDisparo(1);
        }else{
            juego.getRevolver().setPosicionDisparo(juego.getRevolver().getPosicionDisparo() + 1);
        }
    }
    
    public boolean disparo(Juego juego, int indice) {
        boolean bandera = false;
        if (mojar(juego)) {
            System.out.println("<- " + juego.getJugadores().get(indice).getNombre() + " " + juego.getJugadores().get(indice).getId() + " se murio : --->");
            juego.getRevolver().toString();
            juego.getJugadores().get(indice).setMojado(true);
            bandera = true;
        } else {
            System.out.println("<- " + juego.getJugadores().get(indice).getNombre() + " " + juego.getJugadores().get(indice).getId() + " se salvo --->");
            juego.getRevolver().toString();
            siguienteTambor(juego);
        }
        return bandera;
    }
    
    public void ronda (Juego juego){
        boolean bandera = true;
        int indice = 0;
        System.out.println("----Menu (Ruleta RUSA)---- ");
        while(bandera){
            if(indice > juego.getJugadores().size() - 1){
                indice = 0;
            }
            System.out.println("proximo turno para: " + juego.getJugadores().get(indice).getNombre() + " " + juego.getJugadores().get(indice).getId() + " --- ");
            if(disparo(juego,indice)){
                bandera = false;
            }
            indice++;
        }
        System.out.println("Gracias por participar");
    }
    
}
