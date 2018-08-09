/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refusedBequest.refusedBequestBien;



/**
 *
 * @author Fernando
 */
public class CalculadoraAreas {
    
    public double calcularAreaCirculo(double radio){
        return radio*radio*3.14;
    }
    
    public double calcularAreaRectangulo(double ancho, double largo){
        return ancho*largo;
    }
    
    public double calcularAreaElipse( double radioX, double radioY){
        return radioX*radioY*3.14;
    }
    
}
