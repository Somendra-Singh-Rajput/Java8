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
public class Test2 {
    
    int x = 88;
    public void m2()
    {
        int y=10;
        Interf2 I = ()->{ 
            
            /*In Lmabda expression local variable is final and its value cna't be changed.           
            While we can chnage class variable value*/
            
            //y=20;
            x=99;
            System.out.println(x); 
            System.out.println(y);
    };
        I.m1();
    }
    
    public static void main(String[] args)
    {
        Test2 t = new Test2();
        t.m2();
    }
}
interface Interf2
{
    public void m1();
}
