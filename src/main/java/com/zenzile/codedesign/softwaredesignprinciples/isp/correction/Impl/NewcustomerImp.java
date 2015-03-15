/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.isp.correction.Impl;

import com.zenzile.codedesign.softwaredesignprinciples.isp.correction.Newcustomer;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SIHLE
 */
public class NewcustomerImp implements Newcustomer{

    @Override
    public String addUser(String nm) {
        Set name = new HashSet<>();
        
        name.add(nm);
        return "Registered";
    }

     @Override
    public int specialFee(int nm) {
        return 3 + nm;
    }
    
}
