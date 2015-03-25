/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.config;

import com.zenzile.codedesign.softwaredesignprinciples.isp.correction.Impl.NewcustomerImp;
import com.zenzile.codedesign.softwaredesignprinciples.isp.correction.Impl.RegularCustomerImpl;
import com.zenzile.codedesign.softwaredesignprinciples.isp.correction.Newcustomer;
import com.zenzile.codedesign.softwaredesignprinciples.dip.correction.Cricket;
import com.zenzile.codedesign.softwaredesignprinciples.dip.correction.Sport;
import com.zenzile.codedesign.softwaredesignprinciples.dip.correction.Soccer;
import com.zenzile.codedesign.softwaredesignprinciples.isp.correction.RegularCustomer;
import com.zenzile.codedesign.softwaredesignprinciples.isp.violation.Impl.SalonCharge;
import com.zenzile.codedesign.softwaredesignprinciples.isp.violation.Salon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author SIHLE
 */
@Configuration
public class AppConfigCorrecion {

    @Bean(name="newcus")
    public Newcustomer getNew(){
        return new NewcustomerImp();
    }
    @Bean(name="regcus")
    public RegularCustomer getRegular()
    {
        return new RegularCustomerImpl();
    }
    @Bean(name="salcharge")
    public Salon geCharge()
    {
        return new SalonCharge();
    }
    @Bean(name="dipcricket")
    public Sport getCriket()
    {
        return new Cricket();
    }
    @Bean(name="dipsoccer")
    public Sport getSoccer()
    {
        return new Soccer();
    }
}
