/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultMethod;

/**
 *
 * @author singh
 */
public interface Interf {
    
    /*Here we are overriding deafault method
     *From 1.8 and onwards we are able to declare concrete method in Interface
     *To declare default method default keyword is required.
    */
    
    default void m1()
    {
        System.out.println("Default Method");
    }
    
}
