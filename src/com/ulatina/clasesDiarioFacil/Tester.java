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

import com.ulatina.serviciosDiarioFacil.ServicioAdministrador;

import com.ulatina.serviciosDiarioFacil.Servicio_Categoria;
import com.ulatina.serviciosDiarioFacil.Servicio_Producto;
import java.util.Date;
 import java.util.Scanner;
public class Tester {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        ServicioAdministrador sa = new ServicioAdministrador();

        
     
        
        for (Object obj : sa.selectAll()) {
            System.out.println(((Administrador)obj));
        }

    }
    
}
