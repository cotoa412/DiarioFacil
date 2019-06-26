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
public class Cliente extends Usuario{
    
    private int cedulaCliente = 0;
    private String nombreCliente = "";
    private String correo = "";
    private String tipoCliente = "";
    
    public Cliente(){
    
    }
    
    public Cliente(String nombreUsuario,String contrasenna,int cedulaCliente,String nombreCliente,String correoCliente){
    
        super(nombreUsuario,contrasenna);
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.correo = correoCliente;
        this.tipoCliente = "Básico";
       
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    public String toString(){
    
        return this.getCedulaCliente() + " " + this.getNombreCliente() + " " + this.getCorreo()+ " " + this.getTipoCliente();
        
    }
    
    
    
}
