/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.lsk.violation;

/**
 *
 * @author SIHLE
 */
public class African implements Person{

    @Override
    public String identity() {
        return "AFRICA";
    }

    @Override
    public String socialsecurityNumber() {
        throw new UnsupportedOperationException();
    }
    
}
