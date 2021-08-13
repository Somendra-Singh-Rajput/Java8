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
public class Student {
    
    String name;
    int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", rollno=" + rollno + '}';
    }
    
    
}
