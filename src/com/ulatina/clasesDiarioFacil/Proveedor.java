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
public class Proveedor {
    
    private int idProveedor;
    private String nombreProveedor;
    private String correoProveedor;
    private String telProveedor;

    public Proveedor() {
    }

    public Proveedor(String nombreProveedor, String correoProveedor, String telProveedor) {
        this.nombreProveedor = nombreProveedor;
        this.correoProveedor = correoProveedor;
        this.telProveedor = telProveedor;
    }

    public Proveedor(int idProveedor, String nombreProveedor, String correoProveedor, String telProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.correoProveedor = correoProveedor;
        this.telProveedor = telProveedor;
    }
    
  
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }

    public String getTelProveedor() {
        return telProveedor;
    }

    public void setTelProveedor(String telProveedor) {
        this.telProveedor = telProveedor;
    }
    
    
    public String toString(){
    
       return "Id : " + this.getIdProveedor() + " Nombre: " + this.getNombreProveedor() + " Correo: " + this.getCorreoProveedor() + " Tel: " + this.getTelProveedor();
    
    }
    
}
