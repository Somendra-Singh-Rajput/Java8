/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnaryBinary;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

/**
 *
 * @author singh
 */
public class BinaryTest {
    
    /*
    This program shows implementation of Binary operator interface
    It is child interface of BiFunction interface.
    We should go for it if both passed args and return type is same.
    */
    public static void main(String[] args) {
        
        BinaryOperator<Integer> bo = (i,j) -> i+j;        
        System.out.println("Sum of two int numbers using binar operator : "+bo.apply(11,12));
        
        BinaryOperator<String> bo1 = (i,j) -> i+j;        
        System.out.println("Concatenation of two strings using binar operator : "+bo1.apply("Somendra ","Rajput"));
        
        /*
        Primitive versions of binary operator
        */
        
        IntBinaryOperator f = (i,j) -> i*j;
        System.out.println("Multiplication of I and J using primitive binary operator : "+f.applyAsInt(12,10));
    }
}
