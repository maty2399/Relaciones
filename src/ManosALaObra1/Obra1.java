/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManosALaObra1;

import java.util.Scanner;

/**
 *
 * @author Maty
 */
public class Obra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
        objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
        acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
        */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ObPersona1 coso = new ObPersona1();
        System.out.println("Ingresa el nombre");
        coso.setNombre(leer.next());
        System.out.println("Ingresa el apellido");
        coso.setApellido(leer.next());

        ObDNI1 dniDeCoso = new ObDNI1("s", 41752572);
        //Le asigno el DNI a la persona
        coso.setDni(dniDeCoso);
        System.out.println("Nombre: " + coso.getNombre() + " Apellido: " + coso.getApellido() + " DNI: " + coso.getDni().getSerie() + " - " + coso.getDni().getNumero());
    }
   
}
    

