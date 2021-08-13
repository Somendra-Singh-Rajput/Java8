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
public class Test {
    public static void main(String[] args)
    {
        /*Here new Runnable is the object of implemented class of Runnable interface that is Anonymous inner class
        
        */
        Runnable r = new Runnable()
        {
          public void run()
          {
              for(int i=0;i<=10;i++)
              {
                  System.out.println("Child Thtread");
              }
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
