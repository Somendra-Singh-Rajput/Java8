/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class StreamMax {
    
    /*
    *max() method provide the maximum value from the stream elements.
    *But in order to provide mmx. value stream elements should be in sorted order.
    */
    public static void main(String[] args) {
      
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(20);
        al.add(5);
        al.add(15);
        al.add(10);       
        al.add(25);
        
        //We are finding the maximum  value using comparator.
        Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();       
        System.out.println("Minimum value is : "+max);
    
    }
}
