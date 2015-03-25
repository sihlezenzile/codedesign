/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.objectorientedprinciples.inheritance;

/**
 *
 * @author SIHLE
 */
public class HiredEmp extends OllEmployee{
    private double salary;    
    
    public HiredEmp(double s, String name, double insentive) {
       super(name, insentive);
        salary = s;salary = 0.0;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }  
}
