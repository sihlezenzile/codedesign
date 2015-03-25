/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.objectorientedprinciples.polymophism;
import java.util.*;

/**
 *
 * @author SIHLE
 */
public class Drive {
    
    public Drive() {
    }
    public void addCar(Car c)
    {
        List<Car> car = new ArrayList<>();
        car.add(c);
    }
}
