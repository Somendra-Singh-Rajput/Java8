/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveFunctionalI;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

/**
 *
 * @author singh
 */
public class PredicateI {
    
    /*
    This program shows how we can use primitive functional interface Predicate to improve the program performance.
    IntPredicate,LongPredicate,DoublePredicate
    */
    
    public static void main(String[] args) {
        
        int []x = {0,5,10,15,20,25};
        
        IntPredicate ip = i -> i%2==0;
        
        for(int x1 : x)
        {
            if(ip.test(x1))
            System.out.println("Using IntPredicate : "+x1);
        }
        
        System.out.println();
        LongPredicate lp = i -> i%2==0;
        
        for(int x1 : x)
        {
            if(lp.test(x1))
            System.out.println("Using LongPredicate : "+x1);
        }
        
        System.out.println();
        DoublePredicate dp = i -> i%2==0;
        
        for(int x1 : x)
        {
            if(dp.test(x1))
            System.out.println("Using DoublePredicate : "+x1);
        }
    }
}
