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
public class Student {
    
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public String toString()
    {
        String s = String.format("%s,%.2f", name,marks);      
        return s;
    }
}
