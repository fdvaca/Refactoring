/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveObsession.primitiveObsessionBien;

/**
 *
 * @author Fernando
 */
public class IMC {
    
    public double calcularICM(Paciente paciente){
        return paciente.getPeso()/(paciente.getEstatura()*paciente.getEstatura());
    }
    
}
