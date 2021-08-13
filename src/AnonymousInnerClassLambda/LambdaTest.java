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
public class LambdaTest {
    
    public static void main(String[] args)
    {
        Runnable r =()->{for(int i=0;i<=10;i++)
        {
            System.out.println("Child Thread");
        }
        };
        
        Thread t = new Thread(r);
        t.start();
        
        for(int i=0;i<=10;i++)
        {
            System.out.println("Parent Thread");
        }
    }
    
}
