/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.codedesign.objectorientedprinciples.encapsulation;

/**
 *
 * @author sihle
 */
public class EmployeeDe {
    
    Employee em = new Employee();
    
   
    public boolean isNameAvail(String na)
    {
        em.setName("SIHLE");
        return em.getName().equalsIgnoreCase(na);
    
    }
    
}
