/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.serviciosDiarioFacil;

import com.ulatina.clasesDiarioFacil.Cliente;
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
            sql = "SELECT cedula, nombre, contrasenna, nombreUsuario, correo FROM cliente;";
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
    public void insert() {
        Statement stmt = null;
        try {
            //STEP 3: Execute a querey
            super.conectar();
            System.out.println("Conectado a la base, creando un statement...");
            stmt = conn.createStatement();
            int id;
            String nombre;
            String correo;
            String usuario;
            String contra;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite la cedula para insertar en la base de datos:");
            id = sc.nextInt();
            System.out.println("Ingrese el nombre para insertar en la base de datos:");
            nombre = sc.next();
            System.out.println("Ingrese el correo para insertar en la base de datos:");
            correo = sc.next();
            System.out.println("Ingrese el nombre de usuario para insertar en la base de datos:");
            usuario = sc.next();
            System.out.println("Ingrese la contraseña para insertar en la base de datos:");
            contra = sc.next();
            stmt.executeUpdate("insert into cliente (cedula, nombre, correo, nombreUsuario, contrasenna) values ('" + id + "','" + nombre + "','"+ correo +"','"+usuario+"','"+contra+"')");
            System.out.println("Los valores han sido ingresados en la base de datos.");
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
    public void update() {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //STEP 3: Execute a querey
            super.conectar();
            System.out.println("Conectado a la base, creando un statement...");
            stmt = conn.createStatement();
            int ced;
            int sel;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite el la cedula del cliente que sea modificar de la base de datos:");
            ced = sc.nextInt();
            rs = stmt.executeQuery("SELECT cedula, nombre, contrasenna, nombreUsuario, correo FROM cliente WHERE cedula =('" + ced + "')");
            String nombreCliente = rs.getString("nombre");
            String contrasenna = rs.getString("contrasenna");
            int cedulaCliente = rs.getInt("cedula");
            String nombreUsuario = rs.getString("nombreUsuario");
            String correoCliente = rs.getString("correo");
            Cliente c = new Cliente(nombreUsuario, contrasenna, cedulaCliente, nombreCliente, correoCliente);
            System.out.println(c);
            System.out.println("Que desea modificar del cliente?\n1. Tipo cliente.\n2. Contraseña.\n3. Correo. ");
            sel = sc.nextInt();
            switch (sel) {
                case 1:
                    System.out.println("Ingrese el nuevo tipo de cliente que desea actualizar:");
                    String tipocliente;
                    tipocliente = sc.next();
                    stmt.executeUpdate("update cliente set tipocliente = ('" + tipocliente + "') where cedula = ('" + ced + "')");
                    System.out.println("El cliente con la cedula " + ced + " ha sido actualizado.");
                    break;
                case 2:
                    System.out.println("Ingrese la nueva contraseña del cliente que desea actualizar:");
                    String contra;
                    contra = sc.next();
                    stmt.executeUpdate("update cliente set contrasenna = ('" + contra + "') where cedula = ('" + ced + "')");
                    System.out.println("El cliente con la cedula " + ced + " ha sido actualizado.");
                    break;
                case 3:
                    System.out.println("Ingrese lel nuevo correo del cliente que desea actualizar:");
                    String correo;
                    correo = sc.next();
                    stmt.executeUpdate("update cliente set correo = ('" + correo + "') where cedula = ('" + ced + "')");
                    System.out.println("El cliente con la cedula " + ced + " ha sido actualizado.");
                    break;
            }
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
    public void delete() {
        Statement stmt = null;
        try {
            //STEP 3: Execute a querey
            super.conectar();
            System.out.println("Conectado a la base, creando un statement...");
            stmt = conn.createStatement();
            int cedulaCliente;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite la cedula del cliente que sea borrar de la base de datos:");
            cedulaCliente = sc.nextInt();
            stmt.executeUpdate("delete from cliente where cedula = ('" + cedulaCliente + "')");
            System.out.println("El cliente con la cedula " + cedulaCliente + " ha sido removido de la base de datos.");
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
    public Object lookForId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
