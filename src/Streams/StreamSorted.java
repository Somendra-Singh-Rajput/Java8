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
public class StreamSorted {
    
    /*
    *sorted() method is used to sort the elements inside the stream. 
    *sorted() method is used for default sorting and the sorted(Comparator c) method is used for customized sorting.
    */
     public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(20);
        al.add(5);
        al.add(15);
        al.add(10);       
        al.add(25);
     
        System.out.println("Before sorting : "+al);
     
        //Default sorting order using sorted() method
        List<Integer> l = al.stream().sorted().collect(Collectors.toList());
        System.out.println("After sorting using default sorting order : "+l);
        
        //Customized sorting order using sorted(Comparator c) method
        List<Integer> l1 = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("After sorting using customized sorting order : "+l1);
        
     }
}
