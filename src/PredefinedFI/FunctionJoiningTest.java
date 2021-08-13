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
public class FunctionJoiningTest {
    
    public static void main(String[] args)
    {
        /*This example shows Function interface chaining.
        *Here we are joining the two Function interface using andThen() and compose() method.
        */
        Function<String,String> f1 = s -> s.toUpperCase();
        Function<String,String> f2 = s -> s.substring(0,9);
        
        System.out.println(f1.apply("Somendra Singh"));
        System.out.println(f2.apply("Somendra Singh"));
        
        System.out.println(f1.andThen(f2).apply("Somendra Singh"));
        System.out.println(f1.compose(f2).apply("Somendra Singh"));
        
        /*Below code shows difference between andThen and compose method of Function interface
        *andThen() method works like f3 applied first then followed by f4.
        *While in compose() method f4 applied first and then followed by f3. 
        */
        
        Function<Integer,Integer> f3 = i -> i+i;
        Function<Integer,Integer> f4 = i -> i*i*i;
        System.out.println("F3 followed by F4 : "+f3.andThen(f4).apply(2));
        System.out.println("F4 followed by F3 : "+f3.compose(f4).apply(2));
    }
    
}
