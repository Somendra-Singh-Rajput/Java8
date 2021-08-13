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
public class PredicateDisplayTest {
    public static void main(String[] args)
    {
        String[] name = {"Somendra","Bikash","Shubham","Lakshya","Suraj"};
        Predicate<String> startsWithS = s -> s.charAt(0)=='S';
        
        for(String s : name)
        {
            if(startsWithS.test(s))
            {
                System.out.println(s);
            }
        }
    }
    
}
