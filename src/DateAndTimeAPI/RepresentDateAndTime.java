/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTimeAPI;

import java.time.LocalDateTime;

/**
 *
 * @author singh
 */
public class RepresentDateAndTime {
    
    /*
    *This program shows how to show the date and program of any particular day.
    *It also shows how present before and after date of a particular date.
    */
    
    public static void main(String[] args) {
        
        LocalDateTime dt = LocalDateTime.of(1996, 11, 16, 10, 35, 30, 50);
        System.out.println(dt);
        
        System.out.println();
        
        //After 6 months plusMonths() method
        System.out.println("After 6 months : "+dt.plusMonths(6));
        
        System.out.println();
        
        //Before 6 months minusMonths() method
        System.out.println("Before 6 months : "+dt.minusMonths(6));
        
    }
}
