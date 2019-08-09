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
public class PromocionDescuento implements Promocion {

    @Override
    public double descuentoVIP() {
        return 0.00;
    }

    @Override
    public double descuento() {
        return 0.85;
    }
    
}
