/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author singh
 */
public class SetTest {
    public static void main(String[] args)
    {
        
        //By deafult TreeSet follows the ascending order sorting for Integer values
        TreeSet<Integer> ts = new TreeSet<Integer>();
        
        ts.add(10);
        ts.add(2);
        ts.add(0);
        ts.add(3);
        ts.add(1);
        ts.add(12);
        ts.add(7);
        ts.add(15);
        
        System.out.println("Before Sorting : " + ts);
        
        //Here we are passing comparator interface object now this TreeSet will folloow customizing sorting
        TreeSet<Integer> ts1 = new TreeSet<Integer>(new MyComp());
        ts1.add(10);
        ts1.add(2);
        ts1.add(0);
        ts1.add(3);
        ts1.add(1);
        ts1.add(12);
        ts1.add(7);
        ts1.add(15);
        
        System.out.println("After Customized Sorting : " + ts1);
        
         //Here we are lambda expression this TreeSet will folloow customizing sorting using lambda expressions and Comparator interface
        TreeSet<Integer> ts2 = new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        ts2.add(10);
        ts2.add(2);
        ts2.add(0);
        ts2.add(3);
        ts2.add(1);
        ts2.add(12);
        ts2.add(7);
        ts2.add(15);
        
        System.out.println("Sorting using Lambda Expression : " + ts2);
    }
    
}

class MyComp implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        
    if(o1>o2)
    {
     return -1;
    }
    else if(o1<o2)
        {
         return +1;
        }
    else
       {
        return 0;
       }
    }
    
}
