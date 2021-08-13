/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticMethod;

/**
 *
 * @author singh
 */
public class Test implements Interf{
    public static void main(String[] args)
    {
        Test t = new Test();
        
        /*
        *We can call Interface Static method only using the interface name.
        *We can't call interface Static method using implemented class object.
        
        */
        //t.m1();
        Interf.m1();
    }
    
}

interface Interf
{
    public static void m1(){
        System.out.println("Interface Static Method");
    }
}