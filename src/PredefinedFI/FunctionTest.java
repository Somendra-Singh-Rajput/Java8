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
public class FunctionTest {
    
    public static void main(String[] args)
    {
        /*
        *We are implemeting the Function Interface here. It is also a functional interface.
        *It has one method i.e apply(T t) method.
        *But it can return any tpe value and hence it accpets two params one is input and other is return type.
        */
        Function<String,Integer> f = s -> s.length();     
        System.out.println(f.apply("Somendra"));
        
        Function<Integer,Integer> f1 = i -> i*i; 
        System.out.println(f1.apply(5));
    }
}
