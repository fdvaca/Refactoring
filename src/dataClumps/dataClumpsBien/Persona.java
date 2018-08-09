/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataClumps.dataClumpsBien;

import java.util.Date;

/**
 *
 * @author Fernando
 */
public class Persona {
    private int cedula;
    private int nombres;
    private int apellidos;
    private Date fechaDeNacimiento;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNombres() {
        return nombres;
    }

    public void setNombres(int nombres) {
        this.nombres = nombres;
    }

    public int getApellidos() {
        return apellidos;
    }

    public void setApellidos(int apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    
    
}
