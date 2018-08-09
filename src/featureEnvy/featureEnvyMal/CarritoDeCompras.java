/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package featureEnvy.featureEnvyMal;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class CarritoDeCompras {
    
    
    public double calcularPrecioTotalProducto(Producto prod){
        return prod.getPrecio()-prod.getDescuento();
    }
    
    public double calcularPrecioTotal(ArrayList<Producto> arr){
        double total=0;
        for(Producto prod:arr){
            total=total+calcularPrecioTotalProducto(prod);
        }
        return total;
    }
    
}
