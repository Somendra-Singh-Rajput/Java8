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
public class Test1Lambda {

    int x = 888;
    public void m2()
    {      
        /*Using Lambda expression to implement the Interf1 interface. In Lambda expression it always refers outer
        variable not a local variable.
        In Lambda expression we can not decalare instance vriable decalared variable alsways be local variable. 
        */
        Interf1 I = ()->{ 
            int x=999; 
            System.out.println(this.x); 
            };
        I.m1();  
    }
    
    public static void main(String[] args)
    {
        Test1Lambda tl = new Test1Lambda();
        tl.m2();
    }
}

interface Interf1
{
    public void m1();
}