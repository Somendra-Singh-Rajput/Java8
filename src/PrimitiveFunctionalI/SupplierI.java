/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveFunctionalI;

import java.util.function.IntSupplier;

/**
 *
 * @author singh
 */
public class SupplierI {
    
     /*
    This program shows primitive Supplier interface implementation
    */
    
    public static void main(String[] args) {
        
        IntSupplier is = () -> (int)(Math.random()*10);
        
        String otp = "";
        
        for(int i=0;i<=6;i++)
        {
            otp = otp+is.getAsInt();
        }
        System.out.println("6 digit OTP is : "+otp);
    }
}
