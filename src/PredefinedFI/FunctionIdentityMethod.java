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
public class FunctionIdentityMethod {
    
    public static void main(String[] args)
    {
       /*
        *Below we have implemented identity() method of Function interface.
        *identity() method always returns the same value means theat given input.
        */
        
         Function<String,String> f = Function.identity();
         System.out.println(f.apply("Somendra Singh Rajput"));
    }
    
}
