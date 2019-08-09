/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import com.ulatina.serviciosDiarioFacil.Servicio_Categoria;
import com.ulatina.serviciosDiarioFacil.Servicio_Producto;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class MenuAdmin implements iMenu,iAdministrador{
    
    private iSistema sistema;
    private Scanner lector = new Scanner(System.in);
    
    public MenuAdmin(){
    
    }
    
    public MenuAdmin(iSistema sistema){
        this.sistema = sistema;
    }
    
    @Override
    public void desplegarMenu() {
       
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
        
            case 1: this.opcionesProductos();
                break;
            case 2: System.out.println("Mantenimiento de proveedores.");
                break;
            case 3: System.out.println("Opciones de combos.");
                break;    
            case 4: System.out.println("Opciones de pedido.");
                break;    
            case 5: this.menuReporteCliente();
                break;
            case 6: this.opcionesClientes();
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
    
    public void opcionesClientes(){
        
         int op = 0;
        
        do{
        
        System.out.println("1.Ver lista clientes.");
        System.out.println("2.Agregar un nuevo clientte.");
        System.out.println("3.Actualizar datos del cliente.");
        System.out.println("4.Atras.");
        op = lector.nextInt();
       
        switch(op){
        
            case 1: System.out.println(this.verListaClientes());
                break;
        
            case 2:
                
                System.out.println("Digite un nombre de usuario.");
                String nombreUsuario = lector.next();
                System.out.println("Digite un contrasenna.");
                String contrasenna = lector.next();
                System.out.println("Numero de cedula.");
                int cedula = lector.nextInt();
                System.out.println("Nombre del cliente.");
                String nombre = lector.next();
                System.out.println("Correo del cliente.");
                String correo = lector.next();
                
                this.agregarCliente(new Cliente(nombreUsuario,contrasenna,cedula,nombre,correo));
                
                break;
            case 3: 
                break;
            case 4:
                System.out.println("Gracias");
                break;
            default: System.out.println("La opción no es valida.");
            
        }
        
        }while(op != 4);
        
    }
    
    public void opcionesProductos(){
        int op = 0;
        
        do{
        
        System.out.println("1.Ver lista de productos.");
        System.out.println("2.Agregar un nuevo producto.");
        System.out.println("3.Agregar una categoria.");
        System.out.println("4.Atras.");
        op = lector.nextInt();
       
        switch(op){
        
            case 1: System.out.println(this.verProductos());
                break;
        
            case 2: 
                break;
            case 3: 
                break;
            default: System.out.println("La opción no es valida.");
            
        }
        
        }while(op != 4);
    }

    @Override
    public String verProductos() {
        return sistema.mostrarProductos();
    }

    @Override
    public void agregarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void quitarProducto(String nombreProducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarCombo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void quitarCombo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String verListaPedidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hacerPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarPromocion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String verPromociones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String verListaClientes() {
        StringBuffer sb = new StringBuffer();
        for (Cliente cliente: sistema.mostrarListaClientes()) {
            sb.append(cliente);
            sb.append("\n");
        }
        
        return sb.toString();
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        sistema.registrar(cliente);
    }

    @Override
    public void actualizarCliente(String cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCliente(String nombreCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String verListaProveedores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarProveedore(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarProveedor(String proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarProveedor(String proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String verListaFacturas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarFacturaPorFecha(Date fechaFactura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
