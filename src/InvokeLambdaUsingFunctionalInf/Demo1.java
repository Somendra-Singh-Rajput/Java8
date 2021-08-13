/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvokeLambdaUsingFunctionalInf;

/**
 *
 * @author singh
 */
public class Demo1 implements Interf1{

    @Override
    public void Add(int a, int b) {
        System.out.println("Sum Sum by using Normal Expression :"+ (a+b));    
    }
    
}
