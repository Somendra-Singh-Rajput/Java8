/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodConstructorRef;

/**
 *
 * @author singh
 */
public class MethodRefThread {
    
    /*
    *We can use method reference over the lambda expression.
    *Because here we do not need to provide individual implemenetation.
    */
    public void m()
    {
      for(int i=0;i<=10;i++)
      {
          System.out.println("Child Thread");
      }
    }
    public static void main(String[] args) {
        
        MethodRefThread mt = new MethodRefThread();
        
        Runnable r = mt::m;
        
        Thread t = new Thread(r);
        t.start();
        
        for(int j=0;j<=10;j++)
        {
            System.out.println("Main Thread");
        }
    }
}
