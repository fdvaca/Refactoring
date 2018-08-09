/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchStatements.switchStatementsMal;

/**
 *
 * @author Fernando
 */
public class ConsolaVideojuegos {
    
   
    
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
