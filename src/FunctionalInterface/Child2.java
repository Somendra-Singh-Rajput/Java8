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
public interface Child2 extends Parent{
    
    /*
    Here we decalare any other abstract method it will give error because child2 interfasce already have one abstract 
    method from Parent interface and we can't declare new abstract method.
    */
    //public void m1();
}
