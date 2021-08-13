/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author singh
 */
public class ListTest {
    
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(5);
        al.add(7);
        al.add(12);
        
        System.out.println("List elements before sorting : " +al);
        
        //Jvm is going to use deafult sorting order using comparable interface.
        Collections.sort(al);        
        System.out.println("List elements after sorting : " +al);
        
        //Now JVM will use comparator intfercae for customized sorting.
        Collections.sort(al, new MyComparator());
        System.out.println("List elements after sorting : " +al);
        
        //Now JVM will use comparator intfercae for customized sorting.
        Collections.sort(al, new MyComparator1());
        System.out.println("List elements using ternar operator after sorting : " +al);
        
        //Now JVM will use comparator intfercae for customized sorting with lambda expression.
        Collections.sort(al,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        System.out.println("List elements using Lambda expression after sorting : " +al);
        
    }
    
}

class MyComparator1 implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
   
    return (o1>o2)?-1:(o1<o2)?1:0;
    }
    
}
