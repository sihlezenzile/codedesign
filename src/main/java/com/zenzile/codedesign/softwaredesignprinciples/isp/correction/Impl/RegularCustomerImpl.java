/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.isp.correction.Impl;

import com.zenzile.codedesign.softwaredesignprinciples.isp.correction.RegularCustomer;

/**
 *
 * @author SIHLE
 */
public class RegularCustomerImpl implements RegularCustomer {

    @Override
    public int specialFee(int nm) {
        return 3 + nm;
    }
    
}
