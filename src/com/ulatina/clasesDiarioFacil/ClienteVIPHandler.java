/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

/**
 *
 * @author Kainthel
 */
public class ClienteVIPHandler extends AbstractHandler {
    
     @Override
    public void handleRequest(Cliente cliente) {
      if(cliente.getTipoCliente() == "VIP"){
           double promo = 0.75;
        }
      else if (successor != null){
          successor.handleRequest(cliente);
      }
    }
    
}
