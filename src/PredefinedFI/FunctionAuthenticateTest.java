/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author singh
 */
public class FunctionAuthenticateTest {
    
    /*
    This program shows user athentication using Function Interface.
    We have used here Function chaining methods as well.
    */
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter user name : ");
        String name = sc.next();
        System.out.println("Enter user pwd : ");
        String pwd = sc.next();
        
        Function<String,String> f1 = s -> s.substring(0,5);
        Function<String,String> f2 = s -> s.toLowerCase();
        
        if(f1.andThen(f2).apply(name).equals("somen") && pwd.equals("java"))
        {
            System.out.println("Valid user.");
        }
        else
        {
            System.out.println("Invalid user.");
        }
        
        /*
        *Below we have implemented identity() method of Function interface.
        *identity() method always returns the same value means theat given input.
        */
        
         Function<String,String> f3 = Function.identity();
         System.out.println(f3.apply("Somendra Singh Rajput"));
    }
}
