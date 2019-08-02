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
import com.ulatina.serviciosDiarioFacil.Servicio_Categoria;
import com.ulatina.serviciosDiarioFacil.Servicio_Producto;
import java.util.Date;
 import java.util.Scanner;
public class Tester {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        
//       Administrador cliente = new Administrador("anthony3064","123456",604510033,"anthony flores","anohyn@gmaul.com");
//        Cliente cliente = new Cliente();
//        if (cliente.getNombreUsuario().equalsIgnoreCase("anthony3064")) {
//            cliente.mostrarMenu();
//        }
        
        
        Servicio_Producto sp = new Servicio_Producto();
        Servicio_Categoria sc = new Servicio_Categoria();
        
        
        
        for (Object o : sp.selectAll()) {
            System.out.println((Producto)o);
        }
        
        
        
        
    }
    
}
