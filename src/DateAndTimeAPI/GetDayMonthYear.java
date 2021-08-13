/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTimeAPI;

import java.time.LocalDate;

/**
 *
 * @author singh
 */
public class GetDayMonthYear {
    
    /*
    *This program shows how we can print day,month and year individually.
    */
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();
        
        System.out.println(dd+"/"+mm+"/"+yyyy);
        System.out.printf("%d-%d-%d",dd,mm,yyyy);
        System.out.println();
    }
}
