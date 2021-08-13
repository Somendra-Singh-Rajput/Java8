/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.function.Consumer;

/**
 *
 * @author singh
 */
public class ConsumerTest {
    
    /*
    *This function shows the functionality of Consumer Interface.
    * It has one method accept(T t).
    */
    public static void main(String[] args)
    {
        Consumer<String> c = s -> System.out.println(s);
        
        c.accept("Hello Somendra");
    }
    
}
