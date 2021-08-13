/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author singh
 */
public class FunctionStudent {
    
    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<>();
        populate(list);
        
        //Defining the Function interface as per our requirement with required conditions
        Function<Student,String> f = st -> {
                                            double marks =  st.marks;
                                            if(marks>=80)
                                            {
                                                return "A[Distinction]";
                                            }
                                            else if(marks>=60)
                                            {
                                                return "B[First Class]";
                                            }
                                            else if(marks>=50)
                                            {
                                                return "C[Second Class]";
                                            }
                                            else if(marks>=35)
                                            {
                                                return "D[Third Class]";
                                            }
                                            else
                                            {
                                                return "E[Fail]";
                                            }
                                   };
        // We are iterating the ArrayList which have all the objects of Student class.
        for(Student s : list)
        {
            System.out.println("Name : "+s.name);
            System.out.println("Marks : "+s.marks);
            System.out.println("Grade : "+f.apply(s));
            System.out.println();
        } 
        System.out.println("****************Added Predicate Condition In this Section*********************");
        
        Predicate<Student> p = st -> st.marks>60;
        
        for(Student s : list)
        {
            if(p.test(s)){
            System.out.println("Name : "+s.name);
            System.out.println("Marks : "+s.marks);
            System.out.println("Grade : "+f.apply(s));
            System.out.println();
            }
        } 
    }
    
    //Defined a method to populate the ArrayList with Student class objects.
    public static void populate(ArrayList<Student> list)
    {
        list.add(new Student("Somendra", 80));
        list.add(new Student("Bikash", 90));
        list.add(new Student("Suraj", 60));
        list.add(new Student("Shubham", 50));
        list.add(new Student("Lakshya", 35));
        list.add(new Student("Vaishnav", 30));
    }   
}
