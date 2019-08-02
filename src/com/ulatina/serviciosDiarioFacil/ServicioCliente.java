/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.serviciosDiarioFacil;

import com.ulatina.clasesDiarioFacil.Cliente;
import com.ulatina.clasesDiarioFacil.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ServicioCliente extends Servicio implements InterfaceDAO {

    @Override
    public List<Object> selectAll() {
        ResultSet rs = null;
        Statement stmt = null;
        List<Object> uList = new ArrayList<>();
        try {
            //STEP 3: Execute a querey
            super.conectar();
            System.out.println("Conectado a la base, creando un statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM cliente;";
            rs = stmt.executeQuery(sql);
            //STEP 3.1: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                String nombreCliente = rs.getString("nombre");
                String contrasenna = rs.getString("contrasenna");
                int cedulaCliente = rs.getInt("cedula");
                String nombreUsuario = rs.getString("nombreUsuario");
                String correoCliente = rs.getString("correo");
                //Display values
                //   System.out.println("ID: "+id+", Nombre: " +nombre);
                Cliente c = new Cliente(nombreUsuario, contrasenna, cedulaCliente, nombreCliente, correoCliente);
                uList.add(c);

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
    public void insert(Object obj) { //primero metemos el id de serviciousuario en cliente y despues verificamos que sean el mismo y despues el insert.
        ServicioUsuario u = new ServicioUsuario();

        Statement stmt = null;

        u.insert(obj);

        int idDelUsuario = 0;

        for (Object obj2 : u.selectAll()) {
            if (((Cliente) obj2).getNombreUsuario().equals(((Cliente) obj).getNombreUsuario()) && ((Cliente) obj2).getContrasenna().equals(((Cliente) obj).getContrasenna())) {
                idDelUsuario = ((Cliente) obj2).getIdUsuario();
            }
        }

        try {
            super.conectar();
            System.out.println("Conectado a la base, creando un statement...");
            stmt = conn.createStatement();

//            String nombre;
//            String correo;
//            String usuario;
//            String contra;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Digite la cedula para insertar en la base de datos:");
//            id = sc.nextInt();
//            System.out.println("Ingrese el nombre para insertar en la base de datos:");
//            nombre = sc.next();
//            System.out.println("Ingrese el correo para insertar en la base de datos:");
//            correo = sc.next();
//            System.out.println("Ingrese el nombre de usuario para insertar en la base de datos:");
//            usuario = sc.next();
//            System.out.println("Ingrese la contraseña para insertar en la base de datos:");
//            contra = sc.next();
            stmt.executeUpdate("insert into cliente (cedulaCliente, nombreCliente, correo, usuario) values ('" + (((Cliente) obj).getCedulaCliente()) + "','" + (((Cliente) obj).getNombreCliente()) + "','" + (((Cliente) obj).getCorreo()) + "','" + idDelUsuario + "')");
//            System.out.println("Los valores han sido ingresados en la base de datos.");

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
            stmt.executeUpdate("update cliente set nombreCliente = ('" + (((Cliente)obj).getNombreCliente()) +"'), cedulaCliente = ('" + (((Cliente)obj).getCedulaCliente()) +"'), correo = ('" + (((Cliente)obj).getCorreo()) +"')");
            System.out.println("Cliente actualizado exitosamente.");
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
            stmt.executeUpdate("delete from cliente where usuario = ('" + (((Cliente)obj).getUsuario()) + "')");
            System.out.println("El cliente con el id " + (((Cliente)obj).getUsuario()) + " ha sido removido de la base de datos.");
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
