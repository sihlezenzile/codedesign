/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.inheritancealternative;

/**
 *
 * @author SIHLE
 */
public class OllEmployee {
    private String name;
    private double insentive;

    public OllEmployee(String name, double insentive) {
        this.name = name;
        this.insentive = insentive;
    }

    public OllEmployee() {
        
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
