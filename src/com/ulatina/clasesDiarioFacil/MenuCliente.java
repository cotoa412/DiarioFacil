/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class MenuCliente implements iMenu,iUsuario{
    
    private iSistema sistema;
  
    public MenuCliente(){
    }
    
    public MenuCliente(iSistema sistema){
        this.sistema = sistema;
    }
    
    @Override
    public void desplegarMenu() {
        
        Scanner lector = new Scanner(System.in);
        
        int opc = 0;
        
        do{
        System.out.println("----------------------------------------------------");
        System.out.println("1.Ver productos.");
        System.out.println("2.Ver combos.");                       
        System.out.println("3.Ver carrito de compra.");
        System.out.println("4.Cambio de contraseña."); 
        System.out.println("5.Reporte cliente.");
        System.out.println("6.Salir");
        System.out.println("----------------------------------------------------");
        opc = lector.nextInt();
        
        switch(opc){
        
            case 1: 
                    System.out.println(this.verListaProductos());
                    System.out.println("\nDesea agregar al carrito.");
                    String sino = lector.next();
                    
                    if (sino.equalsIgnoreCase("si")) {
                        
                        this.agregarAlCarrito(JOptionPane.showInputDialog("Nombre Producto"),Integer.parseInt(JOptionPane.showInputDialog("cantidad")));
                        if (this.verCarritoCompras().getProductosEnCarrito().size() > 0) {
                            System.out.println("Se agrego su producto al carrito.\n");
                        }else {
                            System.out.println("El carrtio esta vacio.");
                        }
                    }
                break;
            case 2: 
                System.out.println(this.verCombos());
                break;
            case 3: 
                if (this.verCarritoCompras().getProductosEnCarrito().size() > 0) {
                    System.out.println(this.verCarritoCompras());
                }else {
                    System.out.println("El carrtio esta vacio.");
                }
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
        
        System.out.println("----------------------------------------------------");    
        System.out.println("1.Ver historial de órdenes.");
        System.out.println("2.Ver última orden.");
        System.out.println("3.Ver productos más consumidos.");
        System.out.println("4.Atrás.");
        System.out.println("----------------------------------------------------");
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

    @Override
    public String verListaProductos() {
        return sistema.mostrarProductos();
    }

    @Override
    public String verCombos() {
        return sistema.verCombos();
    }

    @Override
    public Carrito verCarritoCompras() {
        return sistema.verCarrito();
    }

    @Override
    public void cambiarContrasenna(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setMediador(iSistema sistema){
        this.sistema = sistema;
    }
    
     @Override
    public void agregarAlCarrito(String nombreProducto, int cantidad) {
        sistema.agregarProductoCarrito(nombreProducto, cantidad);
    }
    
      
}
