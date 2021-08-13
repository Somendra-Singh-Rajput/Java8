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
public class LocalDateTimeTest {
    
    /*
    *If we want to print date and time both at a time we should go for LocalDateTime class
    */
    
    public static void main(String[] args) {
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
        System.out.println();
        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yyyy = dt.getYear();
        
        System.out.println(dd+"-"+mm+"-"+yyyy);
        
        System.out.println();
        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond();
        int ns = dt.getNano();
        
        System.out.println(h+":"+m+":"+s+":"+ns);
    }
            
}
