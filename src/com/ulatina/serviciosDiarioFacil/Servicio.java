/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.ulatina.serviciosDiarioFacil;

import java.sql.Connection;
import java.sql.DriverManager;

/**
*
* @author Personal
*/
public abstract class Servicio {
    
    protected static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    protected static String DB_URL = "jdbc:mysql://mysql3000.mochahost.com/guayabas_patrones"+"?useTimezone=true&serverTimezone=UTC";
    
    protected static String USER = "guayabas_sq";
    protected static String PASS = "salesquest123";
    
    protected static Connection conn =  null;
    
   
    protected void conectar(){
        
        try{
            Class.forName(JDBC_DRIVER);
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    protected void desconectar(){
        
        try{
            if (!conn.isClosed()) {
            conn.close();
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
