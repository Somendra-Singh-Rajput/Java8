/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author singh
 */
public class ZoneIdClass {
    
    /*
    *ZoneId class is used to know the ZoneId.
    *It also used to create ZoneId.
    */
    
    public static void main(String[] args) {
        
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("Current system zone is : "+zone);
        
        System.out.println();
        
        ZoneId zi = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(zi);
        System.out.println("America current date and time is : "+dt);
    }
}
