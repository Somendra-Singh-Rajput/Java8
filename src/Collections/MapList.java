/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Comparator;
import java.util.TreeMap;

/**
 *
 * @author singh
 */
public class MapList {
    
    public static void main(String[] args)
    {
        /*TreeSet will follow the default sorting order using Key*/
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        
        tm.put(100,"Somendra");
        tm.put(300,"Bikash");
        tm.put(200,"Shubham");
        tm.put(500,"Suraj");
        tm.put(600,"Lakshya");
        tm.put(400,"Tushar");
        System.out.println("Before Sorting :" + tm);       
        
        /*TreeSet will follow the customized sorting order using Key according to comparator interface*/
        TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>(new MyComp1());
        
        tm1.put(100,"Somendra");
        tm1.put(300,"Bikash");
        tm1.put(200,"Shubham");
        tm1.put(500,"Suraj");
        tm1.put(600,"Lakshya");
        tm1.put(400,"Tushar");
        System.out.println("Using Customized Sorting :" + tm1);
        
        /*TreeSet will follow the customized sorting order using Key according to comparator interface and Lambda Exp*/
        TreeMap<Integer,String> tm2 = new TreeMap<Integer,String>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        
        tm2.put(100,"Somendra");
        tm2.put(300,"Bikash");
        tm2.put(200,"Shubham");
        tm2.put(500,"Suraj");
        tm2.put(600,"Lakshya");
        tm2.put(400,"Tushar");
        System.out.println("Using Lambda Customized Sorting :" + tm2);
        
    }   
}

class MyComp1 implements Comparator<Integer>{
    
    @Override
    public int compare(Integer i1,Integer i2)
    {
        if(i1>i2)
        {
            return -1;
        }
        else if(i1<i2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
