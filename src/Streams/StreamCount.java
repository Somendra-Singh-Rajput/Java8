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
public class StreamCount {
    
    /*
    *count() method is present in stream interface.
    *It is used to count the elements of stream.
    */
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>();
        al.add("Somendra");
        al.add("Bikash");
        al.add("Suraj");
        al.add("Lakshya");
        
        //count() method implementation is shown below "public long count()"       
        long count = al.stream().filter(s->s.length()>=8).count();
        System.out.println("No. of strings whose length >=8 : "+count);
    }     
}
