/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExp;

/**
 *
 * @author singh
 */
public class LambdaExp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello Somendra!");
    
        System.out.println( System.getProperty("java.version"));
        System.out.println( System.getProperty("java.specification.version"));
        System.out.println( System.getProperty("java.runtime.version"));
        
        LambdaExp le = new LambdaExp();
        le.Display();
        System.out.println(le.StringLength("Somendra"));
        le.Add(5, 10);
          
    }
    
    //Lambda Expression code
     public void Display()
     {
        System.out.println("Hello World!"); 
     }
     
     public int StringLength (String s)
     {
         return s.length();
     }
     
     public void Add(int a, int b)
     {
        int c = a+b;
         System.out.println(c);
     }
}
