/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveFunctionalI;

import java.util.ArrayList;
import java.util.function.ObjIntConsumer;

/**
 *
 * @author singh
 */
public class BIConsumerI {
    
    /*
    This program shows primitive BiConsumer interface implementation
    */
    public static void main(String[] args) {
        
        ArrayList<Employee> list = new ArrayList<>();
        
        Employee e = new Employee("Somendra", 50000);
        list.add(e);
        
        ObjIntConsumer<Employee> ic = (e1,i)-> e1.salary = e1.salary+i;
        
        for(Employee e2 : list)
        {
            ic.accept(e,500);
        }
              
        for(Employee e3 : list)
        {
            System.out.println(e3.name);
            System.out.println(e3.salary);
        }
    }
    
}
