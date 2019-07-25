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
 import java.util.Scanner;
public class Tester {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        
       Cliente cliente = new Cliente("anthony3064","123456",604510033,"anthony flores","anohyn@gmaul.com");
        //Cliente cliente = new Cliente();
        if (cliente.getNombreUsuario().equalsIgnoreCase("anthony3064")) {
            cliente.bienvenidaUsuario();
        }
        
        
            
        
        
        
        
        
        
    }
    
}
