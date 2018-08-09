/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refusedBequest.refusedBequestMal;


/**
 *
 * @author Fernando
 */
public class Rectangulo implements CalculadoraAreas {

    @Override
    public double calcularAreaCirculo(double radio) {
        return 3.14*radio*radio;
    }

    @Override
    public double calcularAreaRectangulo(double ancho, double largo) {
        return ancho*largo;
    }

    @Override
    public double calcularAreaElipse(double radioX, double radioY) {
        return radioX*radioY*3.14;
    }
    
    
  
    
}
