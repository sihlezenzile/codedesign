/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.lsk.violation;

import com.zenzile.codedesign.softwaredesignprinciples.lsk.correction.*;

/**
 *
 * @author SIHLE
 */
public class Europian implements Person{
    @Override
    public String identity() {
        
        return "EUROPE";
    }

    @Override
    public String socialsecurityNumber() {
        return "90210";
    }
   
}
