/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inappropiateIntimacy.inappropiateIntimacyMal;

/**
 *
 * @author Fernando
 */
public class Piloto {
    private Auto auto;
    
    
    public void encenderAuto(){
        auto.encendido=true;
        
    }
    
    public void conducirAuto(Auto auto){
        System.out.println("Conduciendo auto");
    }
    
    
    
}
