/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
            case 2: this.opcionesProveedores();
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
                
                //Para registrar un nuevo cliente en el sistema
                String nombreUsuario = JOptionPane.showInputDialog("Digite un nombre de usuario.");
                
                String contrasenna = JOptionPane.showInputDialog("Digite una contraseña.");
                
                int cedula = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de cedula."));
                
                String nombre = JOptionPane.showInputDialog("Digite el nombre del cliente.");  
                
                String correo = JOptionPane.showInputDialog("Escriba el correo electronico."); 
                
                this.agregarCliente(new Cliente(nombreUsuario,contrasenna,cedula,nombre,correo));
                
                break;
            case 3: 
                System.out.println(this.verListaClientes());
                this.actualizarCliente(JOptionPane.showInputDialog("Digite el nombre de usuario del cliente que desea actualizar."),JOptionPane.showInputDialog("Correo nuevo"));
                System.out.println(this.verListaClientes());
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
        System.out.println("4.Ver lista de Categorias.");
        System.out.println("5.Atras.");
        op = lector.nextInt();
       
        switch(op){
        
            case 1: System.out.println(this.verProductos());
                break;
        
            case 2: 
                
                String nombreProducto = JOptionPane.showInputDialog("Nombre del producto");
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
                int anno = Integer.parseInt(JOptionPane.showInputDialog("Año"));
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio"));
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));
                
                Producto p = new Producto(nombreProducto,(new Date(anno-1900,mes-1,dia)),precio,cantidad);
                this.agregarProducto(p);
                System.out.println("Se agrego el producto correctamente.");
                break;
            case 3:
                
                String nombreCategoria = JOptionPane.showInputDialog("Nombre de la categoria.");
                
                Categoria c = new Categoria(nombreCategoria);
                
                this.agregarCategoria(c);
                
                break;
            case 4: 
                System.out.println(this.verListaCategorias());
                break;
            case 5: 
                System.out.println("Gracias.");
            default: System.out.println("La opción no es valida.");
            
        }
        
        }while(op != 5);
    }
    
    public void opcionesProveedores(){
        int op = 0;
        
        do{
        
        System.out.println("1.Ver lista de proveedores.");
        System.out.println("2.Agregar un nuevo proveedor.");
        System.out.println("3.Actualizar un nuevo proveedor.");
        System.out.println("4.Atras.");
        op = lector.nextInt();
       
        switch(op){
        
            case 1: System.out.println(this.verListaProveedores());
                break;
        
            case 2: 
                String nombreProveedor = JOptionPane.showInputDialog("Nombre del proveedor.");
                String correoProveedor = JOptionPane.showInputDialog("Correo del proveedor.");
                String telProveedor = JOptionPane.showInputDialog("Telefono del proveedor.");
                Proveedor  p = new Proveedor(nombreProveedor,correoProveedor,telProveedor);       
                this.agregarProveedor(p);
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
        sistema.nuevoProducto(producto);
    }

    @Override
    public void agregarCategoria(Categoria categoria) {
        sistema.nuevaCategoria(categoria);
        System.out.println("Se agrego correctamente.");
    }
    
    @Override
    public String verListaCategorias(){
        return sistema.verCategorias();
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
    public void actualizarCliente(String cliente,String correo) {
        sistema.actualizarCliente(cliente,correo);
        System.out.println("Se actualizaron los datos con exito.");
    }

    @Override
    public void eliminarCliente(String nombreCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String verListaProveedores() {
        return sistema.mostrarListaProveedores();
    }

    @Override
    public void agregarProveedor(Proveedor proveedor) {
        sistema.guardarProveedor(proveedor);
        System.out.println("Se agrego correctamente");
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
