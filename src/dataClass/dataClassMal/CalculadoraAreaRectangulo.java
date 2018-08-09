/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataClass.dataClassMal;

/**
 *
 * @author Fernando
 */
public class CalculadoraAreaRectangulo {
    private Rectangulo rect;
    
    public double calcularAreaRectangulo(){
        return rect.getAncho()*rect.getLargo();
    }
    
}
