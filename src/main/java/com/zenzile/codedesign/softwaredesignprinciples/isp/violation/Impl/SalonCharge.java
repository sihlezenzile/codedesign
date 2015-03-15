/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.isp.violation.Impl;

import com.zenzile.codedesign.softwaredesignprinciples.isp.violation.Salon;

/**
 *
 * @author SIHLE
 */
public class SalonCharge implements Salon{

    @Override
    public String addUser(String nm) {
        
        return null;
    }

    @Override
    public int specialFee(int nm) {
        return 3 + nm;
    }
    
    
}
