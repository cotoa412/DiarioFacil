/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

/**
 *
 * @author Personal
 */
public class Administrador extends Usuario {
    
    
    private int cedulaAdmin = 0;
    private String nombreAdmin = "";
    private String correoAdmin = "";
    
    
    public Administrador(){
    
    }
    
    public Administrador(String nombreUsuario,String contrasenna,int cedulaAdmin,String nombreAdmin,String correoAdmin){
    
        super(nombreUsuario,contrasenna);
        this.cedulaAdmin = cedulaAdmin;
        this.nombreAdmin = nombreAdmin;
        this.correoAdmin = correoAdmin;
        
    }

    public int getCedulaAdmin() {
        return cedulaAdmin;
    }

    public void setCedulaAdmin(int cedulaAdmin) {
        this.cedulaAdmin = cedulaAdmin;
    }

    public String getNombreAdmin() {
        return nombreAdmin;
    }

    public void setNombreAdmin(String nombreAdmin) {
        this.nombreAdmin = nombreAdmin;
    }

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }
        
}