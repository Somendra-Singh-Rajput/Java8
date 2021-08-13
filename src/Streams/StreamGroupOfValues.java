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
public class StreamGroupOfValues {
    
    /*
    *We can use stream for group of values as well.
    *There is one method for this Stream.of() method.
    */
    public static void main(String[] args) {
        
        //We are implementing Stream.of() method for group of values
        Stream<Integer> s = Stream.of(10,20,30,40,50,60,70,80,90);
        s.forEach(System.out::println);
    }
}
