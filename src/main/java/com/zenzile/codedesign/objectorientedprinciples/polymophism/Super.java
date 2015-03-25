/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.objectorientedprinciples.polymophism;

/**
 *
 * @author SIHLE
 */
public class Super implements Car{
    
    @Override
    public String engine(String type)
    {
        return "V12";
    }
}
