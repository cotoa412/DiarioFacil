/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Personal
 */
public class Orden {
    
    private Factura fact = new Factura();
    private List<Producto> productos = new ArrayList<>();
    private double pagaCon;
    private double cambio;
    private String piePagina;
    
    public Orden(){
    
    }
    
    
    
    public Orden(Factura fact,Producto producto,double pagaCon){
        
       this.fact = fact; 
       this.agregarProducto(producto);
       this.pagaCon = pagaCon;
         
    }
    
    public Orden(Factura fact,double pagaCon){
        
       
        this.fact = fact;
        this.pagaCon = pagaCon;
        
        
    }
    
   public List<Producto> getProductos(){
       return productos;
   }
    
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
     
    public double getPagaCon(){
        return this.pagaCon;
    }
    
    public void setPagaCon(double pagaCon){
        this.pagaCon = pagaCon;
    }
    
    public double getCambio(){
        return this.cambio;
    }
    
    public String getPiePagina(){
        if (this.getPagaCon() >= 100000) {
            this.piePagina = "Gracias por su compra, Usted ganó una acción.";
        }else{
            this.piePagina = "Gracias por su compra.";
        }
        
        return this.piePagina;
    }
    
    public void setPiePagina(String piePagina){
        this.piePagina = piePagina;
    }
    
   
        
      public String toString(){
      StringBuffer sb = new StringBuffer();
      
     
      sb.append("\n*******************************************************************************************\n");
      sb.append("No.Orden: " + this.getNumeroOrden());
      sb.append("\n");
      sb.append(this.cliente);
      sb.append("Fecha:\t" + this.getFecha());
      sb.append("\n*******************************************************************************************\n");
      sb.append("#P.\tUnidades\tProducto\tPrecio\t\t\t\t\tVolorTotal");
      sb.append("\n*******************************************************************************************\n");
      for (Producto p : this.productos) {
              sb.append(p + "\n");
          }
      sb.append("\n*******************************************************************************************\n");
      sb.append("Total: " + this.totalAPagar);
      sb.append("\n");
      sb.append("Paga Con:" + this.getPagaCon());
      sb.append("\n");
      sb.append("Cambio: " + this.getCambio());
      sb.append("\n*******************************************************************************************\n");
      sb.append(this.getPiePagina());
            
      return sb.toString();
      }
}
