/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.ocp.correction;

/**
 *
 * @author SIHLE
 */
public abstract class Rent {
    
    private String name;
    private double amount;


    public Rent(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public Rent() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public abstract double additionalAmount(double m);
    
}
