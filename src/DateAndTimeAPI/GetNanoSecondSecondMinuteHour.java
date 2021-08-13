/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTimeAPI;

import java.time.LocalTime;

/**
 *
 * @author singh
 */
public class GetNanoSecondSecondMinuteHour {
    
    /*
    *This program shows how we can print nanosecond,second,minutes and hour individually.
    */
    
    public static void main(String[] args) {
        
        LocalTime time = LocalTime.now();
        
        int ns = time.getNano();
        int s = time.getSecond();
        int m = time.getMinute();
        int h = time.getHour();
        
        System.out.println(h+"-"+m+"-"+s+"-"+ns);
        System.out.println();
        System.out.printf("%d:%d:%d:%d",h,m,s,ns);
        System.out.println();
    }
}
