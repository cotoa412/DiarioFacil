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



import java.io.IOException;


public class Tester {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException {
        
       //Inicializando Chain of Responsability
       
       
       Sistema sist = new Sistema();       
       sist.validarUsuario(sist);
      
    }
    
}
