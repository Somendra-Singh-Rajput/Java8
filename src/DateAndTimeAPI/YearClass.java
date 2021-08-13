/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTimeAPI;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author singh
 */
public class YearClass {
    
    /*
    *We have Year class to manipulate or process provided year.
    */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year : ");
        int n = sc.nextInt();
        
        Year y = Year.of(n);
        
        if(y.isLeap())
        {
            System.out.printf("%d is a leap years",n);
        }
        else
        {
           System.out.printf("%d is not a leap years",n); 
        }
        
        System.out.println();
                      
    }
}
