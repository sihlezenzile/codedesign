/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.srp.violation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SIHLE
 */
public class Salon {
    private double price;
    private String stlye;
    private Set name;
    
    public String registerMember(String nm)
    {
        name = new HashSet<>();
        name.add(nm);
        return "Registered";
    }
    
    public double calculatePrice(double p)
    {
        return price*2.20;
    }
    
}
