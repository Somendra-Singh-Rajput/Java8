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
public class StreamMap {
    
    /*
    *Before version 1.8 streams were using to read and write data into file.
    *But from version 1.8 and afterwards we are using streams to process the objects of collection.

    *If we want to create the new collection using one collection by modifying each element of the previous collection we should go for the map() method.
    *map() returns the same number of objects as the collection.
    */
        public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
                
        //Here we are double the each number using streams
        List<Integer> l1 = al.stream().map(i->i*2).collect(Collectors.toList());     
        System.out.println(l1);
    }
}
