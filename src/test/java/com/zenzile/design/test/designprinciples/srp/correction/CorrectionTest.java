/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.design.test.designprinciples.srp.correction;

import com.zenzile.codedesign.softwaredesignprinciples.srp.correction.Pricing;
import com.zenzile.codedesign.softwaredesignprinciples.srp.correction.Register;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SIHLE
 */
public class CorrectionTest {
    
    private Register reg;
    private Pricing price;
    public CorrectionTest() {
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
    public void testCorrection()
    {
        reg = new Register();
        Assert.assertEquals("Registered", reg.registerMember("Sihle"));
    }
    @Test
    public void testPrice()
    {
        price = new Pricing();
        Assert.assertSame(price.calculatePrice(2), 4);
    }
}
