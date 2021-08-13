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
public class StreamForEach {
    
    /*
    *forEach() method won't return anything.
    *This method can take lambda expression as args and apply that lambda expression for each element present in the stream.
    */
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>();
        al.add("Somendra");
        al.add("Bikash");
        al.add("Suraj");
        al.add("Lakshya");
        
        //Printing list elements using forEach() method with lambda expression
        al.stream().forEach(s -> System.out.println(s));
        
        System.out.println();
        
        //Printing the list elements using method reference.
        al.stream().forEach(System.out::println);
    }
}
