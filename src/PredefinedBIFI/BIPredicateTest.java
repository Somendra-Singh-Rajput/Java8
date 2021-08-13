/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedBIFI;

import java.util.function.BiPredicate;

/**
 *
 * @author singh
 */
public class BIPredicateTest {
 
    /*
    BiPredicate is alos a functional interface but it takes two arguments and perform and opertaion.
    And then returns boolan value.
    and(),negate() ,or() static methods are also there
    */
    public static void main(String[] args) {
        
        BiPredicate<Integer,Integer> bp = (a,b) -> (a+b)%2==0;
        
        System.out.println(bp.test(10, 20));
        System.out.println(bp.test(15, 20));
    }
}
