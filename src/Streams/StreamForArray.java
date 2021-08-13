/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.util.stream.Stream;

/**
 *
 * @author singh
 */
public class StreamForArray {
    
    /*
    *We can use stream for array as well.
    *There is one method for this Stream.of() method.
    */
    
    public static void main(String[] args) {
        
        Double[] array = {10.0,23.0,45.0,34.0,45.9};      
        Stream<Double> s = Stream.of(array);
        s.forEach(System.out::println);
    }
}
