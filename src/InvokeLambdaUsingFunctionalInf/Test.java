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
public class Test {
    
    public static void main(String[] args)
    {
        
        /* Calling the methoda of Interf interface without using Lambda Expression
           We have implemented the abtract method in Demo class
        */
        
        /*
        Interf i = new Demo();
        i.m();
        */
        
         /* Calling the method of Interf interface using Lambda Expression
            Here we do not need to write the implementation in any other class
        */        
         Interf i =() -> System.out.println("Sum by using Lambda Expression: Somendra Rajput");
         i.m();
    }
    
}
