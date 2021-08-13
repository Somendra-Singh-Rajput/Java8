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
public class StreamFilter {
    
    /*
    *Before version 1.8 streams were using to read and write data into file.
    *But from version 1.8 and afterwards we are using streams to process the objects of collection.

     *When we want to filter some objects from given objects based on some boolean condition we should go for the filter() method.
     *filter() method always returns less number of objects from the collection.
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
    }
}
