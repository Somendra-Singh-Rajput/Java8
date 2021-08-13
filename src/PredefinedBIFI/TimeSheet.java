/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedBIFI;

/**
 *
 * @author singh
 */
public class TimeSheet {
    
    int eno;
    int days;

    public TimeSheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }

    @Override
    public String toString() {
        return "TimeSheet{" + "eno=" + eno + ", days=" + days + '}';
    }
}
