/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.serviciosDiarioFacil;

import com.ulatina.clasesDiarioFacil.Administrador;
import com.ulatina.clasesDiarioFacil.Cliente;
import com.ulatina.clasesDiarioFacil.Usuario;

/**
 *
 * @author Personal
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServicioUsuario s = new ServicioUsuario();
        
        for (Object obj : s.seleccionarAdministrador()) {
            System.out.println((Administrador)obj);
        }
        
        for (Object obj : s.seleccionarCliente()) {
            System.out.println((Cliente)obj);
        }
        
   
        
    }
    
}
