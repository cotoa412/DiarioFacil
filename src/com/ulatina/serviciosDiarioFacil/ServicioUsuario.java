/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.serviciosDiarioFacil;

import com.ulatina.clasesDiarioFacil.Administrador;
import com.ulatina.clasesDiarioFacil.Cliente;
import com.ulatina.clasesDiarioFacil.Usuario;
import static com.ulatina.serviciosDiarioFacil.Servicio.conn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laboratorio
 */
public class ServicioUsuario extends Servicio implements InterfaceDAO {

    @Override
    public List<Object> selectAll() {
        ResultSet rs = null;
        StringBuffer s = new StringBuffer();
        Statement stmt = null;
        List<Object> uList = new ArrayList<>();
        try {
            //STEP 3: Execute a querey
            super.conectar();
        
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM usuario;";
            rs = stmt.executeQuery(sql);
            //STEP 3.1: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int idUsuario = rs.getInt("idUsuario");
                String nombreUsuario = rs.getString("nombreUsuario");
                String contrasenna = rs.getString("contrasenna");
                //Display values
                //   System.out.println("ID: "+id+", Nombre: " +nombre);
               
               Usuario usuario = new Administrador();
               usuario.setIdUsuario(idUsuario);
               usuario.setNombreUsuario(nombreUsuario);
               usuario.setContrasenna(contrasenna);
               uList.add(usuario);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                super.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return uList;        
    }

    @Override
    public void insert(Object obj) {
        Statement stmt = null;
        try {
            //STEP 3: Execute a querey
            super.conectar();
            
            stmt = conn.createStatement();
             stmt.executeUpdate("insert into usuario (nombreUsuario, contrasenna) values ('" + (((Usuario)obj).getNombreUsuario()) + "','" + (((Usuario)obj).getContrasenna()) + "')");
              
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ha pasado un error.");
        } finally {
            try {
                stmt.close();
                super.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }        
    }

    @Override
    public void update(Object obj) {
        Statement stmt = null;
        try {
            //STEP 3: Execute a querey
            super.conectar();
            System.out.println("Conectado a la base, creando un statement...");
            stmt = conn.createStatement();
            stmt.executeUpdate("update usuario set nombreUsuario = ('" + (((Usuario)obj).getNombreUsuario()) +"'), contrasenna = ('" + (((Usuario)obj).getContrasenna()) +"')");
              System.out.println("Usuario actualizado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ha pasado un error.");
        } finally {
            try {
                stmt.close();
                super.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }         
    }

    @Override
    public void delete(Object obj) {
        Statement stmt = null;
        try {
            //STEP 3: Execute a querey
            super.conectar();
            System.out.println("Conectado a la base, creando un statement...");
            stmt = conn.createStatement();
            stmt.executeUpdate("delete from usuario where idUsuario = ('" + (((Usuario)obj).getIdUsuario()) + "')");
            System.out.println("El usuario con el id " + (((Usuario)obj).getIdUsuario()) + " ha sido removido de la base de datos.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ha pasado un error.");
        } finally {
            try {
                stmt.close();
                super.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
