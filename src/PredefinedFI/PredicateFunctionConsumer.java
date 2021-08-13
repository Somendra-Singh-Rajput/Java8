/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import static PredefinedFI.FunctionStudent.populate;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author singh
 */
public class PredicateFunctionConsumer {
    
    //This program show implemenation all three functional interfaces Predicate, Function and Consumer.
    
    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<>();
        populate(list);
        
        //Defining the Predicate Interface which checks student has the marks greater than 60 or not.
        Predicate<Student> p = s -> s.marks>60;
        
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
        //Defining the Cosumer Interface it displays the student infomration to the console.
        Consumer<Student> c = s -> {
                                System.out.println("Name : "+s.name);
                                System.out.println("Marks : "+s.marks);
                                System.out.println("Grade : "+f.apply(s));
                                System.out.println();
        };
        
        for(Student s : list)
        {
            if(p.test(s))
            {
                c.accept(s);
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
