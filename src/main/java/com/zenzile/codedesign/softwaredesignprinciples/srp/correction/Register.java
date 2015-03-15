/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.srp.correction;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SIHLE
 */
public class Register {
    
    private Set name;
    public String registerMember(String nm)
    {
        name = new HashSet<>();
        name.add(nm);
        return "Registered";
    }
}
