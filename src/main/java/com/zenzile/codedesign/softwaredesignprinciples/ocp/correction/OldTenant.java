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
public class OldTenant extends Rent{
    
    public OldTenant(String name, double amount) {
        super(name, amount);
    }

    public OldTenant() {
    }
    
    @Override
    public double additionalAmount(double m) {
        return  m * 2;
    }  
}
