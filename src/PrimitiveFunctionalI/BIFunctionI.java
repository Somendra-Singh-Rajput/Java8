/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveFunctionalI;

import java.util.function.IntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;

/**
 *
 * @author singh
 */
public class BIFunctionI {
    
    /*
    This program shows how we can use primitive functional interface BiFunction to improve the program performance.
    IntPredicate,LongPredicate,DoublePredicate
    */
    
    public static void main(String[] args) {
        
        ToIntBiFunction<Double,Double> f = (d1,d2) -> (int) (d1*d2);         
        System.out.println("Using ToIntBiFunction : "+f.applyAsInt(5.0,6.0));
        System.out.println();
        
        ToLongBiFunction<Double,Double> f1 = (d1,d2) -> (long) (d1*d2);         
        System.out.println("Using ToLongBiFunction : "+f1.applyAsLong(5.0,6.0));
        System.out.println();
        
        ToDoubleBiFunction<Double,Double> f2 = (d1,d2) -> (double) (d1*d2);         
        System.out.println("Using ToDoubleBiFunction : "+f2.applyAsDouble(5.0,6.0));
        System.out.println();
        
    }
    
}
