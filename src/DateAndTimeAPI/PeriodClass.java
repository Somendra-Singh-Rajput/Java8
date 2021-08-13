/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author singh
 */
public class PeriodClass {
    
    /*
    *We have Peroid class to find the peroid between two dates and time.
    */
    
    public static void main(String[] args) {
        
        LocalDate birthday = LocalDate.of(1996, 11, 16);       
        LocalDate today =LocalDate.now();
        
        Period p = Period.between(birthday,today);     
        System.out.println("Your age is : "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days.");
        
        LocalDate deathDate = LocalDate.of(1996+60, 11, 16);
   
        Period p1 = Period.between(today,deathDate);      
        int d = p1.getYears()*365+p1.getMonths()*30+p1.getDays();
        System.out.println();
        
        System.out.printf("You will be alive only %d days more.", d);
        System.out.println();
    }
}
