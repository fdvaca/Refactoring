/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgunSurgery.shotgunSurgeryMal;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class TiendaVideojuegos {
    private ConsolaVideojuegos cv;
    
    
    public double obtenerPrecioConDescuento(String nombre){
        if(nombre.toLowerCase().equals("xbox")){
            return cv.obtenerPrecio(nombre)+50;
        }
        else if(nombre.toLowerCase().equals("switch")){
            return cv.obtenerPrecio(nombre)+40;
        }
        else if(nombre.toLowerCase().equals("playstation")){
            return cv.obtenerPrecio(nombre)+30;
        }
        else{
            return 0;
        }
    }
    
    public double calcularTotal(ArrayList<ConsolaVideojuegos> arr){
        int total=0;
        for(ConsolaVideojuegos cv: arr){
            total+=obtenerPrecioConDescuento(cv.getNombre());
        }
        return total;
    }
    
    
    
    
}
