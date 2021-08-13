/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author singh
 */
public class Employee {
    int eno;
    String ename;
    
    Employee(int eno,String ename)
    {
    this.eno=eno;
    this.ename=ename;
    }
    
    public String toString()
    {
        return eno+" : "+ename;
    }
    
}
