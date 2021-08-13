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
public class StreamMin {
    
    /*
    *min() method provide the minimum value from the stream elements.
    *But in order to provide min. value stream elements should be in sorted order.
    */
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(20);
        al.add(5);
        al.add(15);
        al.add(10);       
        al.add(25);
        
        //We are finding the minimum value using comparator.
        Integer min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();       
        System.out.println("Minimum value is : "+min);
        
    }
}
