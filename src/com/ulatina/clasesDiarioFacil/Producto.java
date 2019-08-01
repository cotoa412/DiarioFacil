/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import java.util.Date;



/**
 *
 * @author Personal
 */
public class Producto {
    
    private int codigoProducto;
    private String nombreProducto;
    private Date fechaVencimiento;
    private double precioProducto;
    private int cantidad;
    private Categoria categoria;
    
    public Producto(){}
    
    public Producto(String nombreProducto,Date fechaVencimiento,double precioProducto,int cantidad,Categoria categoria){
    
        this.nombreProducto = nombreProducto;
        this.fechaVencimiento = fechaVencimiento;
        this.precioProducto = precioProducto;
        this.cantidad = cantidad;
        this.categoria = categoria;
        
    }

    public Producto(int codigoProducto, String nombreProducto, Date fechaVencimiento, double precioProducto, int cantidad, Categoria categoria) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.fechaVencimiento = fechaVencimiento;
        this.precioProducto = precioProducto;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString(){
     return this.getCodigoProducto() + " " + this.getNombreProducto() + " " + this.getFechaVencimiento() + " " + this.getPrecioProducto() + " " + this.getCantidad();
    }
}
