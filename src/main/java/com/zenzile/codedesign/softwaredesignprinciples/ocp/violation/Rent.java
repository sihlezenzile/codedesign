/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.ocp.violation;

import com.zenzile.codedesign.softwaredesignprinciples.ocp.violation.Tenant;
import com.zenzile.codedesign.softwaredesignprinciples.ocp.violation.NewTenant;
/**
 *
 * @author SIHLE
 */
public  class Rent implements Tenant{

    public Rent() {
    }

    @Override
    public double additionalAmount(Tenant m) {
        
        if(m.equals(new NewTenant()))
            return 5000 * 3;
        
        return 5000 * 2;
    }
}
