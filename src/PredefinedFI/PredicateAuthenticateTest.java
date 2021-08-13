/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author singh
 */
public class PredicateAuthenticateTest {
    public static void main(String[] args)
    {
        Predicate<User> p = user -> user.name.equals("Somendra") && user.pwd.equals("Java");
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter user name : ");
        String name = sc.next();
        System.out.println("Enter user pwd : ");
        String pwd = sc.next();
        
        User user = new User(name,pwd);
        
        if(p.test(user))
        {
            System.out.println("You are a valid user");
        }
        else
        {
            System.out.println("Invalid user please login again with right credentials.");
        }
    }
}
