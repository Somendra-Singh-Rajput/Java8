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
@FunctionalInterface
public interface Child1 extends Parent {
    
    /*
    Here Child1 interface is overriding the Parent method so overall it has only one abstract method so we won't get
    any error.
    */
    public void m();
}
