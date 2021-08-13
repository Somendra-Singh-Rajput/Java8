/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvokeLambdaUsingFunctionalInf;

/**
 *
 * @author singh
 */
public class Test2 {
    public static void main(String[] args)
    {
        /* 
        Calling the methoda of Interf1 interface without using Lambda Expression
        We have implemented the abtract method in Demo1 class
        */
        
        /*
        Interf2 i = new Demo2();
        System.out.println(i.getLength("Somendra"));
        */
        
        /* 
        Calling the method of Interf1 interface using Lambda Expression
        Here we do not need to write the implementation in any other class
        */  
        
        Interf2 i = s->s.length();
        System.out.println(i.getLength("Somendra"));
    }
    
}
