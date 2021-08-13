/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author singh
 */
public class PredicateTest {
    
    public static void main(String[] args)
    {
        /*Predicate is a predefined functional interface which perform some opertaion on passed parameters
        and returns boolean value as ture and fasle.
        It has only one method i.e test() method*/
        
        Predicate<Integer>p = I -> I>10;
        System.out.println(p.test(100));
        System.out.println(p.test(5));
        
        //To check given string length is greater 10 or not
        Predicate<String> p1 = s -> s.length()>10;
        System.out.println(p1.test("Somendra"));
         System.out.println(p1.test("SomendraSingh"));
         
         //To check wether List is empty or not
         Predicate<Collection> p2 = c -> c.isEmpty();
         List<Integer> list = new ArrayList<>();
         list.add(10);
         System.out.println(p2.test(list));
         
         ArrayList list1 = new ArrayList();
         System.out.println(p2.test(list1));
    }
    
}
