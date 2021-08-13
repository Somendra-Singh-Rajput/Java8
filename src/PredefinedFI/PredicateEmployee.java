/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author singh
 */
public class PredicateEmployee {
    
    public static void main(String[] args)
    {
        ArrayList<Employee> al = new ArrayList<>();
        populate(al);
        System.out.println(al);
        
        Predicate<Employee> p1 = emp  -> emp.designation.equals("Team Lead");
        System.out.println("Team Leads information is : ");
        Display(p1, al);
        
        Predicate<Employee> p2 = emp  -> emp.city.equals("Pune");
        System.out.println("Pune city employees information is : ");
        Display(p2, al);
        
        Predicate<Employee> p3 = emp  -> emp.salary<=1300000;
        System.out.println("Employees information whose salary less than 1300000 is : ");
        Display(p3, al);
        
        System.out.println("Employees information whose salary greater than 1300000 is : ");
        Display(p3.negate(), al);
        
        System.out.println("Employees infomration who are Team Leads and city is Pune : ");
        Display(p1.and(p2), al);
        
    }
    
    public static void Display(Predicate<Employee> pe, ArrayList<Employee> list)
    {
        for(Employee e : list)
        {
            if(pe.test(e))
            {
                System.out.println(e);
            }
        }
        System.out.println("*********************************************************");
    }
    public static void populate(ArrayList<Employee> list)
    {
        list.add(new Employee("Somendra", "CEO", 1000000, "Jaipur"));
        list.add(new Employee("Bikash", "Software Developer", 900000, "Odisa"));
        list.add(new Employee("Suraj", "System Engineer", 1200000, "Patna"));
        list.add(new Employee("Shubham", "Support Executive", 1300000, "Patna"));
        list.add(new Employee("Laskhya", "Assistant System Engineer", 800000, "Vadodara"));
        list.add(new Employee("Vaishnav", "QA Tester", 1100000, "Nagpur"));
        list.add( new Employee("Kushal", "Java Developer", 1500000, "Indore"));
        list.add(new Employee("Aman", "Team Lead", 1800000, "Delhi"));
        list.add(new Employee("Rahul", "Manager", 2000000, "Pune"));
        list.add(new Employee("Rajendra", "Team Lead", 1900000, "Pune"));
        
    }
}
