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
public class PredicateJoiningTest {
    
    /*Here we are joining many predicate conditions in a single statement*/
     public static void main(String[] args)
    {
    
        int[] x = {0,5,10,14,20,3,9,7,32,11};
        Predicate<Integer> p1 = I -> I>10;
        Predicate<Integer> p2 = I -> I%2==0;
        System.out.println("The numbers greater than 10 are : ");
        m1(p1,x);
        System.out.println("The even numbers are : ");
        m1(p2,x);
        System.out.println("The numbers not greater than 10 are : ");
        m1(p1.negate(),x);
        System.out.println("The numbers greater than 10 and even are : ");
        m1(p1.and(p2),x);
        System.out.println("The numbers greater than 10 or even are : ");
        m1(p1.or(p2),x);
    }
     
     public static void m1(Predicate<Integer> p, int[] x)
     {
         for(int i:x)
         {
             if(p.test(i))
             System.out.println(i);
         }
     }
        
}
