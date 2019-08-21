/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.diarioFacil.DAO;

import com.ulatina.clasesDiarioFacil.Cliente;
import com.ulatina.clasesDiarioFacil.Orden;
import static com.ulatina.diarioFacil.DAO.Servicio.conn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Personal
 */
public class ServicioProductoComprado extends Servicio implements InterfaceDAO {

    @Override
    public List<Object> selectAll() {
        ResultSet rs = null;
        Statement stmt = null;
        ServicioCliente sc = new ServicioCliente();
        List<Object> oList = new ArrayList<>();
        Cliente c = new Cliente();
        try {
            //STEP 3: Execute a querey
            super.conectar();
           
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM Factura";
            rs = stmt.executeQuery(sql);
            //STEP 3.1: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int numeroFactura = rs.getInt("numeroFactura");
                int cliente = rs.getInt("cliente");
                Date fechaFactura = rs.getDate("fecha");
                double totalPagar = rs.getDouble("totalPagar");
                
                for (Object obj : sc.selectAll()) {
                    
                    if (((Cliente)obj).getCedulaCliente() == cliente) {
                        c = ((Cliente)obj);
                    }
                    
                }
                
                Orden o = new Orden (numeroFactura,c,fechaFactura,totalPagar);
                oList.add(o);

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
        return oList;
    }

    @Override
    public void insert(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
