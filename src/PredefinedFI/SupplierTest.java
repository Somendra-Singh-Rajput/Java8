/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.Date;
import java.util.function.Supplier;

/**
 *
 * @author singh
 */
public class SupplierTest {
    
    /*
    This program show implementation of Supplier interface. It does not take anthing as input it onl provides something.
    So that's why it only has return type. It has only one abstract method that is get();
    */
    public static void main(String[] args) {
        
        //Current date 
        Supplier<Date> s = () -> new Date();        
        System.out.println("Current date is : "+s.get());
        
        //Display random string      
        Supplier<String> s1 = () -> {
            String str[] = {"Somendra","Bikash","Suraj","Lakshya","Shubham"};
            int x = (int)(Math.random()*4);
            return str[x];
        };
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
        
        //Generate random OTP
        Supplier<String> s2 = () -> {
        
            String otp="";
            for(int i=0;i<6;i++)
            {
               otp = otp + (long)(Math.random()*10); 
            }      
            return otp;
        };
        System.out.println(s2.get());
        System.out.println(s2.get());
        System.out.println(s2.get());
        
        //Generate random password
        Supplier<String> s3 = () ->{
            
            Supplier<Integer> d = ()->(int)(Math.random()*10);            
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";           
            Supplier<Character> c = ()->symbols.charAt((int)(Math.random()*29));
            
            String pwd="";
             for(int i=1; i<=8; i++)
            {
               if(i%2==0)
               {
                   pwd = pwd+d.get();
               }
               else
               {
                   pwd = pwd+c.get();
               }
            }      
             return pwd;
        };
        
        System.out.println(s3.get());
        System.out.println(s3.get());
        System.out.println(s3.get());
    }
    
}
