/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import java.util.List;

/**
 *
 * @author Personal
 */
public interface iSistema {
    
    public void registrar(Cliente usuario);
    public void validarUsuario(iSistema sistema);
    public void nuevoProducto(Producto producto);
    public String mostrarProductos();
    public void nuevaCategoria(Categoria categoria);
    public String verCategorias();
    public List<Cliente> mostrarListaClientes();
    public void actualizarCliente(String cliente,String correo);
    public void guardarProveedor(Proveedor proveedor);
    public String mostrarListaProveedores();
}
