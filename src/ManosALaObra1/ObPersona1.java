/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManosALaObra1;

/**
 *
 * @author Maty
 */
public class ObPersona1 {
    private String nombre;
    private String apellido;
    private ObDNI1 dni;

    public ObPersona1() {
    }

    public ObPersona1(String nombre, String apellido, ObDNI1 dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ObDNI1 getDni() {
        return dni;
    }

    public void setDni(ObDNI1 dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "ObPersona1{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
}
