/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inappropiateIntimacy.inappropiateIntimacyBien;

/**
 *
 * @author Fernando
 */
public class Auto {
    private String marca;
    private String modelo;
    private boolean encendido;
    
    
    public void encenderAuto(){
        this.encendido=true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    
    
}
