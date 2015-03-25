/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.inheritancealternative;

import com.zenzile.codedesign.objectorientedprinciples.inheritance.*;

/**
 *
 * @author SIHLE
 */
public class HiredEmp{
    private double salary;     
    private String name;
    private double insentive;
    
    public HiredEmp(double s, String name, double insentive) {
        
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInsentive() {
        return insentive;
    }

    public void setInsentive(double insentive) {
        this.insentive = insentive;
    }
}
