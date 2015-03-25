/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.design.test.designprinciples.dip.correction;

import com.zenzile.codedesign.config.AppConfigCorrecion;
import com.zenzile.codedesign.softwaredesignprinciples.dip.correction.Sport;
import com.zenzile.codedesign.softwaredesignprinciples.dip.correction.Soccer;
import com.zenzile.codedesign.softwaredesignprinciples.dip.correction.Sport;
import com.zenzile.codedesign.softwaredesignprinciples.dip.correction.Cricket;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author SIHLE
 */
public class CorrectionTest {
    private ApplicationContext ctx;
    Sport sport1;
    Sport sport2;
    
    
    public CorrectionTest() {
    }
    
    
    @Before
    public void setUp() {
        ctx = new AnnotationConfigApplicationContext(AppConfigCorrecion.class);
        sport1 = (Sport)ctx.getBean("dipsoccer");
        sport2 = (Sport)ctx.getBean("dipcricket");
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testSport()
    {
        
    }
    
}
