/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import java.util.Date;

/**
 *
 * @author Personal
 */
public interface iAdministrador {
    
    //Mantenimiento de productos
    public String verProductos();
    public void agregarProducto(Producto producto);
    public void agregarCategoria(Categoria categoria);
    public void quitarProducto(String nombreProducto);
    
    //Creacion de combos
    public void agregarCombo();
    public void quitarCombo();
    
    //Pedidos
    public String verListaPedidos();
    public void hacerPedido(Pedido pedido);
    
    //Promociones
    public void agregarPromocion();
    public String verPromociones();
    
    //Mantenimiento de clientes
    public String verListaClientes();
    public void agregarCliente(Cliente cliente);
    public void actualizarCliente(String cliente);
    public void eliminarCliente(String nombreCliente);
    
    //Mantenimiento de provedores
    public String verListaProveedores();
    public void agregarProveedore(Proveedor proveedor);
    public void actualizarProveedor(String proveedor);
    public void eliminarProveedor(String proveedor); 
    
    
    //Ordenes o facturas
    public String verListaFacturas();
    public void buscarFacturaPorFecha(Date fechaFactura);
       
//    System.out.println("1.Mantenimiento de productos.");
//                System.out.println("2.Mantenimiento de proveedores.");
//                System.out.println("3.Creación de paquetes.");
//                System.out.println("4.Pedido.");
//                System.out.println("5.Promoción");
//                System.out.println("6.Mantenimiento de clientes.");
//                System.out.println("7.Ordenes.");
//                System.out.println("8.Salir");
//                System.out.println("------------
    
}
