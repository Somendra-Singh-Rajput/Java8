/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnonymousInnerClassLambda;

/**
 *
 * @author singh
 */
public class Test1 {
    
    int x = 888;
    public void m2()
    {
        Interf I = new Interf()
        {
            int x = 999;
            public void m1()
            {
                System.out.println(this.x); 
            }
        };
        I.m1();
    }
    public static void main(String[] args)
    {
        Test1 t1 = new Test1();
        t1.m2();
    }    
}

interface Interf
{
public void m1();
}