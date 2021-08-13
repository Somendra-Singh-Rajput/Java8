/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveFunctionalI;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

/**
 *
 * @author singh
 */
public class FunctionI {
    
     /*
    This program shows how we can use primitive functional interface Function to improve the program performance.
    IntPredicate,LongPredicate,DoublePredicate
    */
    
    public static void main(String[] args) {
        
        IntFunction<Integer> f = i -> i*i;       
        System.out.println(f.apply(5));       
        //To check string length
        ToIntFunction<String> f1 = s -> s.length();
        
        System.out.println(f1.applyAsInt("Somendra"));
        
        IntToDoubleFunction f2=i->Math.sqrt(i);
        
        System.out.println(f2.applyAsDouble(9));
    }
}
