/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.codedesign.softwaredesignprinciples.dip.violation;
import com.zenzile.codedesign.softwaredesignprinciples.dip.violation.Cricket;
/**
 *
 * @author SIHLE
 */
public class Soccer{
    Cricket cric = new Cricket();
    public String play()
    {
        return "Kick " + cric.play() ;
    }
}
