/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnaryBinary;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/**
 *
 * @author singh
 */
public class UnaryTest {
    
    /*
    This program shows implementation of Unary operator interface.
    It is child interface of Function interface.
    We should go for it if passed args and return value is same.
    */
    public static void main(String[] args) {
        
        UnaryOperator<Integer> op = i -> i*i;       
        System.out.println("Square of I using unary operator : "+op.apply(5));
        
        /*
        Primitive versions of unary operator
        */
        
        IntUnaryOperator io = j -> j*j;       
        System.out.println("Square of I using primitive unary operator : "+io.applyAsInt(10));
        
        DoubleUnaryOperator io1 = k -> k*k;       
        System.out.println("Square of I using primitive unary operator : "+io1.applyAsDouble(11));
    }
}
