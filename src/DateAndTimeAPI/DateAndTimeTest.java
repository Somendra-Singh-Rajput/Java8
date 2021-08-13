/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author singh
 */
public class DateAndTimeTest {
    
    /*
    *In version 1.8 we have a new Date and Time API that is very convenient. 
    *It presents in java.time.* package.
    *It is also known as Joda API as it is developed b joda.org people.
    */ 
    
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        System.out.println("Local current date is : "+date);
        
        LocalTime time = LocalTime.now();
        System.out.println("Local current time is : "+time);
    }
}
