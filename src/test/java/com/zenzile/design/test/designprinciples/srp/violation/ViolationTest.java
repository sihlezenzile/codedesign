/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.design.test.designprinciples.srp.violation;

import com.zenzile.codedesign.softwaredesignprinciples.srp.violation.Salon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SIHLE
 */

public class ViolationTest {
   
    private Salon salon;
    
    public ViolationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testSalon()
    {
        salon = new Salon();
        
        Assert.assertNotNull(salon.calculatePrice(5));
        Assert.assertNotNull(salon.registerMember("Zisa"));
        
        
    }
}
