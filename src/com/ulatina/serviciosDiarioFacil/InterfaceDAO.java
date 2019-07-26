/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.serviciosDiarioFacil;

import java.util.List;

/**
 *
 * @author Alejandro
 */
public interface InterfaceDAO {
    public List<Object> selectAll();
    public void insert(Object obj);
    public void update(Object obj);
    public void delete(int id);
    public Object lookForId(int id);
    
}
