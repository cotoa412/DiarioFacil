/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.serviciosDiarioFacil;

import com.ulatina.clasesDiarioFacil.Categoria;
import com.ulatina.clasesDiarioFacil.Cliente;
import static com.ulatina.serviciosDiarioFacil.Servicio.conn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Personal
 */
public class Servicio_Categoria extends Servicio implements InterfaceDAO{

    @Override
    public List<Object> selectAll() {
        ResultSet rs = null;
        Statement stmt = null;
        List<Object> cList = new ArrayList<>();
        try {
            //STEP 3: Execute a querey
            super.conectar();
            System.out.println("Conectado a la base, creando un statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM categoria;";
            rs = stmt.executeQuery(sql);
            //STEP 3.1: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int idCategoria = rs.getInt("idCategoria");
                String nombreCategoria = rs.getString("nombreCategoria");
                //Display values
                Categoria c = new Categoria(idCategoria,nombreCategoria);
                cList.add(c);

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
        return cList;

    }

    @Override
    public void insert(Object obj) {
        Statement stmt = null;
        
        String nombreCategoria = ((Categoria)obj).getNombreCategoria();
     
        try{
            this.conectar();
            
            stmt = conn.createStatement();
            String sql = "INSERT INTO categoria(nombreCategoria) VALUES("+nombreCategoria+")";
            
            int i = stmt.executeUpdate(sql);
            
            System.out.println("Categoria creada con éxito.");
            
        }catch(Exception e){
            
            e.printStackTrace();
            
        }finally{
            
            try{
                    
                stmt.close();
                this.desconectar();
                
            }catch(Exception e){
                
                e.printStackTrace();
                
            }
        }
    }

    @Override
    public void update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object lookForId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
