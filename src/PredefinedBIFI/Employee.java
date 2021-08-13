/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedBIFI;

/**
 *
 * @author singh
 */
public class Employee {
    
    int eno;
    String name;
    double dailyWage;
    double salary;

    public Employee(int eno, String name, double dailyWage) {
        this.eno = eno;
        this.name = name;
        this.dailyWage = dailyWage;
    }

    
    public Employee(int eno, String name, double dailyWage,double salary) {
        this.eno = eno;
        this.name = name;
        this.dailyWage = dailyWage;
        this.salary =  salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "eno=" + eno + ", name=" + name + ", dailyWage=" + dailyWage + ", salary=" + salary + '}';
    }

    
}
