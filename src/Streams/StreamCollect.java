/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author singh
 */
public class StreamCollect {
    
    /*
    *collect() method is used to collect the elements of stream.
    *It collects the stream elements and add them to specified collection.
    */
    
     public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        
        //Here we are finding the even numbers using streams
        List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());      
        System.out.println(l);
                
        //Here we are double the each number using streams
        List<Integer> l1 = al.stream().map(i->i*2).collect(Collectors.toList());     
        System.out.println(l1);
    }
}
