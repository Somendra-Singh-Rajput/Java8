/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedBIFI;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 *
 * @author singh
 */
public class BIConsumer {
    /*
    This program shows BiConsumer interface implementation. It can take two arguments but won't return anything.
    Default method andThen();
    */
    public static void main(String[] args) {
        
        BiConsumer<String, String> bc1 = (s1,s2) -> System.out.println(s1+s2);
        bc1.accept("Somendra ", "Singh Raput");
        
        //Program to show incremented slaray using BiFunction & BiConsumer interface
        
        ArrayList<Employee> al = new ArrayList<>();
        BiFunction<String,Double,Employee> bf = (name,salary) -> new Employee(name,salary);
        
        al.add(bf.apply("Somendra",35000.0));
        al.add(bf.apply("Bikash",40000.0));
        al.add(bf.apply("Suraj",37000.0));
        
        BiConsumer<Employee,Double> bc = (e,increment) -> e.salary = e.salary+increment;
        
        for(Employee e : al)
        {
            bc.accept(e,500.0);
        }
        
        for(Employee e : al)
        {
            System.out.println("Name : " + e.name);
            System.out.println("Salary : " + e.salary);
            System.out.println();
        }
    }
}
