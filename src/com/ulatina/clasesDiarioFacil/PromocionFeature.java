/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import com.ulatina.diarioFacil.DAO.ServicioCliente;

/**
 *
 * @author Laboratorio
 */
public class PromocionFeature extends PromocionDecorador{
    
    public PromocionFeature(Promocion promocion) {
        super(promocion);
    }

    @Override
    public double descuentoVIP() {
        double promo=0;
        ServicioCliente sc=new ServicioCliente();
        for(Object obj: sc.selectAll()){
         if(((Cliente)obj).getTipoCliente()=="VIP"){
            promo = 0.75;
         }else{
             promo = 0;
         }
            }
       getPromocion().descuentoVIP();
       
       return promo;
    }

    @Override
    public double descuento() {
        double promo=0;
        ServicioCliente sc=new ServicioCliente();
        for(Object obj: sc.selectAll()){
         if(((Cliente)obj).getTipoCliente()=="Basico"){
            promo = 0.85;
         }else{
             promo = 0;
         }
            }
       getPromocion().descuento();
       
       return promo;
    }
    
}
