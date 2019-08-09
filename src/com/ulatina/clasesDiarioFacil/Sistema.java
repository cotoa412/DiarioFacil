/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.clasesDiarioFacil;

import com.ulatina.serviciosDiarioFacil.ServicioAdministrador;
import com.ulatina.serviciosDiarioFacil.ServicioCliente;
import com.ulatina.serviciosDiarioFacil.ServicioUsuario;
import com.ulatina.serviciosDiarioFacil.Servicio_Categoria;
import com.ulatina.serviciosDiarioFacil.Servicio_Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Sistema implements iSistema{
    
    private Scanner lector = new Scanner(System.in);
    private ServicioCliente servicioCliente = new ServicioCliente();
    private ServicioAdministrador servicioAdmin = new ServicioAdministrador();
    private Servicio_Producto sp = new Servicio_Producto();
    private Servicio_Categoria sc = new Servicio_Categoria();
    
    @Override
    public void registrar(Cliente usuario) {
        
        servicioCliente.insert(usuario);
        
        System.out.println("Guardado con exito.");
        
    }
    
    @Override
    public void validarUsuario(iSistema sistema){
        
        do{
        
        System.out.println("Bienvenido a Diario Facil.");
            System.out.println("-----------------------------------------------");
        System.out.println("Digite su nombre de usuario.");
        String nombreUsuario = lector.next();
        System.out.println("Digite su contrasenna.");
        String contrasenna = lector.next();
        
        for (Object obj : servicioCliente.selectAll()) {
            
            if (((Usuario)obj).getNombreUsuario().equalsIgnoreCase(nombreUsuario) && ((Usuario)obj).getContrasenna().equalsIgnoreCase(contrasenna) && ((Usuario)obj).getIdUsuario() == ((Cliente)obj).getUsuario()) {
                
                    
                Cliente clienteValidado = ((Cliente)obj);
                MenuCliente menuCliente = new MenuCliente(sistema);
                clienteValidado.setComportamientoUsuario(menuCliente);
                
                System.out.println("Bienvenido " + clienteValidado.getNombreCliente());
               
                
                clienteValidado.mostrarMenu();
                
            }else{
                
                for (Object obj2 : servicioAdmin.selectAll()) {
                
                    if (((Usuario)obj2).getNombreUsuario().equalsIgnoreCase(nombreUsuario) && ((Usuario)obj2).getContrasenna().equalsIgnoreCase(contrasenna) && ((Usuario)obj2).getIdUsuario() == ((Administrador)obj2).getUsuario()) {
                
                    
                    Administrador adminValidado = ((Administrador)obj2);
                    MenuAdmin menuAdmin = new MenuAdmin(sistema);
                    adminValidado.setComportamientoUsuario(menuAdmin);
                
                    System.out.println("Bienvenido " + adminValidado.getNombreAdmin());
                       
                    adminValidado.mostrarMenu();
                
                } 
                }
                
            }
             
        }
       
        }while(true);
    }
    
    
    @Override
    public String mostrarProductos(){
        
        StringBuffer sb = new StringBuffer();
        
        sb.append("----------------------------------------------------");
        sb.append("\n");
        
        for (Object obj : sc.selectAll()) {
            
                    sb.append(((Categoria)obj).getNombreCategoria());
                    sb.append("\n");
                    
                    for (Object o : sp.selectAll()) {
                        
                        if (((Categoria)obj).getIdCategoria() == ((Producto)o).getCategoria().getIdCategoria()) {
                            
                            sb.append(((Producto)o));
                            sb.append("\n");
                            
                        }
                }
                 sb.append("----------------------------------------------------\n");
                }
        sb.append("----------------------------------------------------\n");
        
        
        return sb.toString();
    }
    
    @Override
    public List<Cliente> mostrarListaClientes(){
        ServicioCliente sc = new ServicioCliente();
        
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        
        for (Object obj : sc.selectAll()) {
            listaClientes.add(((Cliente)obj));
        }
        return listaClientes;
    }
}

