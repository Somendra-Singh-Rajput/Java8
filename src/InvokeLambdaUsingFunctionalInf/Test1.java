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
public class Test1{
    
     public static void main(String[] args)
    {        
        /* 
        Calling the methoda of Interf1 interface without using Lambda Expression
        We have implemented the abtract method in Demo1 class
        */
        
        /*
        Interf1 i = new Demo1();
        i.Add(11,22);
        */
        
         /* 
        Calling the method of Interf1 interface using Lambda Expression
        Here we do not need to write the implementation in any other class
        */  
        
        Interf1 i =(a,b) -> System.out.println("Sum by using Lambda Expression:" + (a+b));
        i.Add(9,19);
    }  

    public void m2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
