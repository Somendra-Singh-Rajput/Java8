/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodConstructorRef;

/**
 *
 * @author singh
 */
public class ConstructorRefTest {
    
    /*
    *Double Colon Operator(::) It is for method reference and constructor reference. 
    *In this we ust provide the constructor ref as shown below
    *Advantage is code reusability.
    */
    
    public static void main(String[] args) {
        
        Interf1 i1 = Sample::new;
        
        Sample s = i1.get();
    }
    
}


class Sample
{
    public Sample() {
        System.out.println("Constructor reference execution & object creation.");
    }   
}

interface Interf1
{
    public Sample get();
}