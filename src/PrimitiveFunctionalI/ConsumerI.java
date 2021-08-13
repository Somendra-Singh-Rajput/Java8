/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveFunctionalI;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/**
 *
 * @author singh
 */
public class ConsumerI {
    
    /*
    This program shows primitive Consumer interface implementation
    */
    
    public static void main(String[] args) {
        
        IntConsumer ic = i-> System.out.println("The square of I is : "+i*i);
        ic.accept(10);
        
        LongConsumer ic1 = i-> System.out.println("The square of I is : "+i*i);
        ic1.accept(11);
        
        DoubleConsumer ic2 = i-> System.out.println("The square of I is : "+i*i);
        ic2.accept(12);
    }
}
