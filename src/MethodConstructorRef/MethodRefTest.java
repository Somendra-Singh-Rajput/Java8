/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodConstructorRef;

/**
 *
 * @author singh
 */
public class MethodRefTest {
    
    /*
    *Double Colon Operator(::) It is for method reference and constructor reference. 
    *Suppose we want to provide the same implementation to any method m1() like already 
    *defined function m2() then we would use :: operator to give reference of m2() to m1() method.
    *Advantage is code reusability.
    *Condition is both should have same args.
    */
    
    public static void m2()
    {
        System.out.println("This is referred by method m1()");
        System.out.println("It is example of Method reference");
    }
    public static void main(String[] args) {
        
        Interf i = MethodRefTest::m2;
        i.m1();
    }
}

interface Interf
{
    public void m1();
}
