/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class MenuAdmin implements iMenu{

    @Override
    public void desplegarMenu() {
        Scanner lector = new Scanner(System.in);
        
        int opc = 0;
        
        do{
            
            System.out.println("1.Mantenimiento de productos.");
            System.out.println("2.Mantenimiento de proveedores.");
            System.out.println("3.Creación de paquetes.");
            System.out.println("4.Pedido.");
            System.out.println("5.Promoción");
            System.out.println("6.Mantenimiento de clientes.");
            System.out.println("7.Ordenes.");
            System.out.println("8.Salir");
            opc = lector.nextInt();
        
        switch(opc){
        
            case 1: System.out.println("Mantenimiento de productos.");
                break;
            case 2: System.out.println("Mantenimiento de proveedores.");
                break;
            case 3: System.out.println("Opciones de combos.");
                break;    
            case 4: System.out.println("Opciones de pedido.");
                break;    
            case 5: this.menuReporteCliente();
                break;
            case 6: System.out.println("Mantenimiento de clientes.");
                break;
            case 7: System.out.println("Ordenes.");
                break;
            case 8: System.out.println("Gracias.");
                break;    
            default: System.out.println("La opción no es valida.");
            
        }
        
        }while(opc != 8);
    }
    
    public void menuReporteCliente(){
    Scanner lector = new Scanner(System.in);
        
        int op = 0;
        
        do{
        
        System.out.println("1.Ver lista promociones.");
        System.out.println("2.Crear una promocion.");
        System.out.println("3.Atrás.");
        op = lector.nextInt();
       
        switch(op){
        
            case 1: 
                break;
        
            case 2: 
                break;
            case 3: 
                break;
            default: System.out.println("La opción no es valida.");
            
        }
        
        }while(op != 3);
    
    
    }
    
}
