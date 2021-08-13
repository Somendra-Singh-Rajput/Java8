/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.function.Predicate;

/**
 *
 * @author singh
 */
public class PredicatePubEntry {
    
    public static void main(String[] args)
    {
        SoftwareEngineer[] se = {new SoftwareEngineer("Somendra", 24, false),
                                  new SoftwareEngineer("Shubham", 21, true),
                                  new SoftwareEngineer("Lakshya", 18, true),
                                  new SoftwareEngineer("Bikash", 15, false)};
        
       Predicate<SoftwareEngineer> p = sf->sf.age>=18 && sf.isHavingGf==true;
       
       for(SoftwareEngineer s : se)
       {
        if(p.test(s))
        {
            System.out.println(s.name + " is allowed.");
        }
        else
        {
            System.out.println(s.name + " is not allowed.");
        }
       }
    }
}
