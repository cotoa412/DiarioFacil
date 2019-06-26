/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.diarioFacil;

/**
 *
 * @author Personal
 */
public abstract class Usuario {
    
    protected String nombreUsuario = "";
    protected String contrasenna = "";

    public Usuario() {
        
    }
    
    public Usuario(String nombreUsuario,String contrasenna) {
        
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
        
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    public String toString(){
    
        return this.getNombreUsuario() + " " + this.getContrasenna();
        
    }
    
}
