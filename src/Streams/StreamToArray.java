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
public class StreamToArray {
    
    /*
    *toArray() method is used to copy elements of stream into specified array.
    */
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(10);
        al.add(15);
        al.add(5);
        al.add(25);
        al.add(20);
               
        Integer[] ar = al.stream().toArray(Integer [] :: new);
        for(Integer i : ar)
        {
            System.out.println(i);
        }
    }
}
