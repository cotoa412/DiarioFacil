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
public interface iSistema {
    
    public void registrar(Cliente usuario);
    public void validarUsuario(iSistema sistema);
    public String mostrarProductos();
    
    
}
