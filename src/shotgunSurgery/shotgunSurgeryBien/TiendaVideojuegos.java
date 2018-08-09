/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgunSurgery.shotgunSurgeryBien;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class TiendaVideojuegos {
    
   
    
    public double calcularTotal(ArrayList<ConsolaVideojuegos> arr){
        int total=0;
        for(ConsolaVideojuegos cv: arr){
            total+=cv.obtenerPrecioConDescuento();
        }
        return total;
    }
    
}
