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
public class ObDNI1 {
    private String serie;
    private Integer numero; 

    public ObDNI1() {
    }

    public ObDNI1(String serie, Integer numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ObDNI1{" + "serie=" + serie + ", numero=" + numero + '}' + "\n";
    }

}
