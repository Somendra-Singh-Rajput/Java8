/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.function.Predicate;

/**
 *
 * @author singh
 */
public class PredicateIsEqualMethod {
 
    public static void main(String[] args)
    {
        Predicate<String> p =  Predicate.isEqual("Somendra");
        System.out.println(p.test("Somendra"));
        System.out.println(p.test("Singh"));
        
        Predicate<Employee> p1 = Predicate.isEqual(new Employee("Somendra","CEO",10000000,"Jaipur"));
        Employee e1 = new Employee("Somendra","CEO",10000000,"Jaipur");
        Employee e2 = new Employee("Bikash","Manager",80000000,"Pune");
        
        System.out.println(p1.test(e1));
        System.out.println(p1.test(e2));
    }
}