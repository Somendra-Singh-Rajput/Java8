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
public class FunctionEmployee {
    
    public static void main(String[] args)
    {
        //This is the preogram to find the total salary of all employees using Function(I).
        
        ArrayList<Employee> list = new ArrayList<>();
        populate(list);
        System.out.println("Before increment : "+list);
        Function<ArrayList<Employee>,Double> f = emp -> {
                                        double totalSalary = 0;
          
                                        for(Employee e : list)
                                            {
                                                totalSalary = totalSalary + e.salary;
                                            }
                                            return totalSalary;
            
                                        };
                        System.out.println("Total salry of all employee : "+f.apply(list));  
                        
        //Below is the code to increment the salary if salary is less than 15000
        Predicate<Employee> p = emp1 -> emp1.salary <15000;
        Function<Employee,Double> f1 = emp1 -> {
                                                emp1.salary = emp1.salary + 499;
                                                return emp1.salary;
                                              };
        ArrayList<Employee> list2 = new ArrayList<>();
        for(Employee e : list)
        {
            if(p.test(e))
            {
                f1.apply(e);
                list2.add(e);
            }
        }
        System.out.println("After Increment whose salary was less than 15000: "+list2);
    }
    
    public static void populate(ArrayList<Employee> list)
    {
        list.add(new Employee("Somendra", "CEO", 10000, "Jaipur"));
        list.add(new Employee("Bikash", "Software Developer", 9000, "Odisa"));
        list.add(new Employee("Suraj", "System Engineer", 12000, "Patna"));
        list.add(new Employee("Shubham", "Support Executive", 13000, "Patna"));
        list.add(new Employee("Laskhya", "Assistant System Engineer", 8000, "Vadodara"));
        list.add(new Employee("Vaishnav", "QA Tester", 11000, "Nagpur"));
        list.add( new Employee("Kushal", "Java Developer", 15000, "Indore"));
        list.add(new Employee("Aman", "Team Lead", 18000, "Delhi"));
        list.add(new Employee("Rahul", "Manager", 20000, "Pune"));
        list.add(new Employee("Rajendra", "Team Lead", 19000, "Pune"));
        
    }
    
}
