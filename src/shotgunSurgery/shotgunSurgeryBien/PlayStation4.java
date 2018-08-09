/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgunSurgery.shotgunSurgeryBien;



/**
 *
 * @author Fernando
 */
public class PlayStation4 implements ConsolaVideojuegos {
    private double precio;
    private double descuento;
    
    @Override
    public double obtenerPrecio() {
        return precio;
    }
    
    @Override
    public double obtenerPrecioConDescuento() {
        return precio-descuento;
    }
    
}
