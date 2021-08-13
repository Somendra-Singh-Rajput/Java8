/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.function.Function;

/**
 *
 * @author singh
 */
public class FunctionRemoveSpace {
    
    public static void main(String[] args)
    {
        /*Program to remove space from a string using Function interface.
        *And to count the number of space present in the string.
        */
        
        String s = "Somendra Singh Rajput";        
        Function<String,String> f = s1 -> s1.replaceAll(" ","");
        System.out.println(f.apply(s));
        
        Function<String,Integer> f1 = s2 -> s2.length()- s2.replaceAll(" ","").length();
        System.out.println("Total space count is : "+f1.apply(s));
        
    }
}
