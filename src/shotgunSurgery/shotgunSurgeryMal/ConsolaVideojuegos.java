/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgunSurgery.shotgunSurgeryMal;



/**
 *
 * @author Fernando
 */
public class ConsolaVideojuegos {
    
   private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double obtenerPrecio(String nombre){
        if(nombre.toLowerCase().equals("xbox")){
            return 459.99;
        }
        else if(nombre.toLowerCase().equals("switch")){
            return 299.99;
        }
        else if(nombre.toLowerCase().equals("playstation")){
            return 699.99;
        }
        else{
            return 0;
        }
    }
    
}
