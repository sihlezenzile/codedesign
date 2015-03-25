/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.codedesign.objectorientedprinciples.encapsulation;

/**
 *
 * @author sihle
 */
public class  Employee 
{ 
    private String name;
    private String position;
    
    public String addEmployee(String n, String p)
    {
        
        return n +" "+ p;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    } 
}
