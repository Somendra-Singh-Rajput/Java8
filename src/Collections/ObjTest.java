/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author singh
 */
public class ObjTest {
    public static void main(String[] args)
    {
        Employee emp = new Employee(100,"Somendra");
        Employee emp1 = new Employee(300,"Bikash");
        Employee emp2 = new Employee(400,"Lakshya");
        Employee emp3 = new Employee(200,"Suraj");
        Employee emp4 = new Employee(500,"Shubham");
        
        System.out.println(emp+" , "+emp1+" , "+emp2+" , "+emp3+" , "+emp4);
        
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(emp);
        al.add(emp1);
        al.add(emp2); 
        al.add(emp3);
        al.add(emp4);
        
        System.out.println("Before Sorting : "+al);
        
        Collections.sort(al,(e1,e2)->(e1.eno > e2.eno)?-1:(e1.eno < e1.eno)?1:0);
        
        System.out.println("Customized Sorting using Lamda expression: "+al);
          
        
    }
    
}
