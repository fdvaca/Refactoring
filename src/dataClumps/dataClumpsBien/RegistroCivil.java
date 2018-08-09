/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataClumps.dataClumpsBien;

/**
 *
 * @author Fernando
 */
public class RegistroCivil {
    
    public void registrarPersonaEnRegistro(Persona persona){
        System.out.println(persona.getCedula());
        System.out.println(persona.getNombres());
        System.out.println(persona.getApellidos());
        System.out.println(persona.getFechaDeNacimiento().toString());
        
    }
    
}
