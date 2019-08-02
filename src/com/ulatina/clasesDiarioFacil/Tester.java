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
        
        
//       Cliente cliente = new Cliente("anthony3064","123456",604510033,"anthony flores","anohyn@gmaul.com");
//               if (cliente.getNombreUsuario().equalsIgnoreCase("anthony3064")) {
//            cliente.mostrarMenu();
//        }
//        
        
        
        ServicioAdministrador sa = new ServicioAdministrador();
        
        Administrador admin = new Administrador("Anthony3064","garrask8",604510033,"Anthony Flores Boza","anthonyestiven3064@gmailcom");
        
        sa.insert(admin);
        
        
        for (Object obj : sa.selectAll()) {
            System.out.println(((Administrador)obj));
        }
    }
    
}
