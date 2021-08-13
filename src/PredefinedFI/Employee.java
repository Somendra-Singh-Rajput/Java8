/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

/**
 *
 * @author singh
 */
public class Employee {
    
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }
    /*
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city + '}';
    }
    */
    public String toString()
    {
        String s = String.format("%s,%s,%.2f,%s",name,designation,salary,city);
        
        return s;
    }
    
    public boolean isEqual(Object obj)
    {
        Employee e = (Employee)obj;
        if(name.equals(e.name)&&designation.equals(e.designation)&&salary==e.salary&&city.equals(e.city))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
