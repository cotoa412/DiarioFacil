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
public class Factura {
    
    private int numeroOrden;
    private Cliente cliente;
    private Date fecha = new Date();
    private double totalPagar;
    
    
    public Factura(){
    
    }
    
    
    
    public Factura(int numeroOrden,Cliente object,Date fecha,double totalPagar){
        
       
        this.numeroOrden = numeroOrden;
        this.cliente = object;
        this.fecha = fecha;
        this.totalPagar = totalPagar;
        
    }
    
    public Factura(Cliente object,Date fecha,double totalPagar){
        
        this.cliente = object;
        this.fecha = fecha;
        this.totalPagar = totalPagar;
    }
    
    public int getNumeroOrden(){
        return this.numeroOrden;
    }
    
    public void setNumeroOrden(int numeroOrden){
        this.numeroOrden = numeroOrden;
    }
    
    public Object getCliente(){
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
    
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
  
    @Override
      public String toString(){
          
      return this.getNumeroOrden() + " " + this.getCliente() + " " + this.getFecha() + " " + this.getTotalPagar();      
      
      }

}

