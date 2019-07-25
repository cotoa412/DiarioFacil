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
public class MenuCliente implements iMenu{

    @Override
    public void desplegarMenu() {
        
        Scanner lector = new Scanner(System.in);
        
        int opc = 0;
        
        do{
        
        System.out.println("1.Ver productos.");
        System.out.println("2.Ver combos.");                       
        System.out.println("3.Ver carrito de compra.");
        System.out.println("4.Cambio de contraseña."); 
        System.out.println("5.Reporte cliente.");
        System.out.println("6.Salir");
        opc = lector.nextInt();
        
        switch(opc){
        
            case 1: System.out.println("Lista de productos.");
                break;
        
            case 2: System.out.println("Lista de combos.");
                break;
            case 3: System.out.println("Carrito de compra.");
                break;    
            case 4: System.out.println("Cambiar contrasenna.");
                break;    
            case 5: this.menuReporteCliente();
                break;
            case 6: System.out.println("Gracias.");
                break;
            default: System.out.println("La opción no es valida.");
            break;
        }
        
       }while(opc != 6);
    }
    
    public void menuReporteCliente(){
    Scanner lector = new Scanner(System.in);
        
        int op = 0;
        
        do{
        
        System.out.println("1.Ver historial de órdenes.");
        System.out.println("2.Ver última orden.");
        System.out.println("3.Ver productos más consumidos.");
        System.out.println("4.Atrás.");
        op = lector.nextInt();
        
        switch(op){
        
            case 1: 
                break;
        
            case 2: 
                break;
            case 3: 
                break;    
            case 4: 
                break;
            default: System.out.println("La opción no es valida.");
                break;
        }
        
        }while(op != 4);
    
    }
    
}
