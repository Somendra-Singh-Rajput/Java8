/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedBIFI;

import java.util.ArrayList;
import java.util.function.BiFunction;

/**
 *
 * @author singh
 */
public class BIFunctionTest {
    
    /*
    BiFunction is also a functional interface but it can take two args and can return any value.
    It has only one abstract method apply();
    It has same static method like Function(I) andThen()
    */
    public static void main(String[] args) {
        
        BiFunction<Integer,Integer,Integer> bf = (a,b) -> (a*b);
        System.out.println(bf.apply(10, 20));
        System.out.println(bf.apply(11, 26));
        
        //Creating student object using BiFunction
        ArrayList<Student> al = new ArrayList<Student>();
        BiFunction<String,Integer,Student> bf1 = (name,rollno) -> new Student(name, rollno);
        
        al.add(bf1.apply("Somendra Singh", 101));
        al.add(bf1.apply("Bikash", 102));
        al.add(bf1.apply("Suraj", 103));
        
        for(Student s : al)
        {
            System.out.println("Name : " + s.name);
            System.out.println("Roll No : " + s.rollno);
            System.out.println();
        }
        
        //Calculating employee monthly salary
        Employee e = new Employee(101,"Somendra", 1500);
        TimeSheet t = new TimeSheet(101,31);
        
        BiFunction<Employee,TimeSheet,Double> bf2 = (e1,t1) -> e.dailyWage*t.days; 
        System.out.println("Monthl salary : "+bf2.apply(e, t));
        
    }
    
}
