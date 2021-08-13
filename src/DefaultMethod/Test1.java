/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultMethod;

/**
 *
 * @author singh
 */
public class Test1 implements Left, Right{
    
    /*
    *Avoiding the ambiguity problem we have overriden the Left & Right interface deafult method.
    */
    public void m1()
    {
        System.out.println("Overriding Left & Right default method");
        
        /*
        *Apart from overriding the methods we have below process the access the particular interface default method.
        */     
        Left.super.m1();
        Right.super.m1();
    }
    public static void main(String[] args)
    {
        Test1 t = new Test1();
        t.m1();
    }
    
}

interface Left
{
    default void m1()
    {
        System.out.println("Left default Method");
    }
}

interface Right
{
    default void m1()
    {
        System.out.println("Right default method");
    }
}