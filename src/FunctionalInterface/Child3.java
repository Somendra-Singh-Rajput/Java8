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
public interface Child3 extends Parent {
    
    /*
    Here we have declaraed one new abstract method and we weill not get error because we did not declarae the Child3 interface
    as FunctionInterfasce using annotation.
    */
    public void m1();
}
