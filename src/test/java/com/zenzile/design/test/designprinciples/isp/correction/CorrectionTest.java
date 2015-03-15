/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.design.test.designprinciples.isp.correction;

import com.zenzile.codedesign.config.AppConfigCorrecion;
import com.zenzile.codedesign.softwaredesignprinciples.isp.correction.Newcustomer;
import com.zenzile.codedesign.softwaredesignprinciples.isp.correction.RegularCustomer;
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
    private Newcustomer newc;
    private RegularCustomer reg;
    
    public CorrectionTest() {
    }
    
    @Before
    public void setUp() {
        ctx = new AnnotationConfigApplicationContext(AppConfigCorrecion.class);
        newc = (Newcustomer)ctx.getBean("newcus");
        reg = (RegularCustomer)ctx.getBean("regcus");
    }
    
    @Test
    public void testIsp()
    {
        
    }
}
