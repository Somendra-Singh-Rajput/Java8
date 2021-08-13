/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterface;

/**
 *
 * @author singh
 */

/*
An interface which contains only one abstract method and any number of default and static methods. Such as
Runnable
Callable
ActionListener
Comparable
*/
@FunctionalInterface
public interface FunctionalInf {
    
    //Only one abstract method
    public void m1();
    
    //public void m2();
    
    default void m3()
    {
        
    }
    
    public static void m4()
    {
        
    }
    
}
