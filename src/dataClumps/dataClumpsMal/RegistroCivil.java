/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataClumps.dataClumpsMal;

import java.util.Date;

/**
 *
 * @author Fernando
 */
public class RegistroCivil {
   
    
    public void registrarPersonaEnRegistro(int cedula, int nombres, int apellidos, Date fechaDeNacimiento){
        System.out.println(cedula);
        System.out.println(nombres);
        System.out.println(apellidos);
        System.out.println(fechaDeNacimiento.toString());
    }
    
    
}
