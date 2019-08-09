/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

/**
 *
 * @author laboratorio
 */
public class PromocionVIP implements Promocion{

    @Override
    public double descuentoVIP() {
        double promo=0;
        Cliente cliente=new Cliente();
        if(cliente.getTipoCliente() == "VIP"){
            promo=0.75;
        }
        return promo;
    } 

    @Override
    public double descuento() {
        return 0.00;
    }
    
}
