/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author singh
 */
public class PredicateRemoveNullAndEmptyString {
    
    public static void main(String[] args)
    {
        String[] str = {"Sam", " ","Suraj",null," ","Bikash",null};
        Predicate<String> removeNullAndEmpty = s -> s != null && s.length()!=0;
        
        ArrayList<String> l = new ArrayList<>();
        for(String s : str)
        {
            if(removeNullAndEmpty.test(s))
            {
                l.add(s);
            }
        }
        System.out.println("The valid list is : ");
        System.out.println(l);
    }
}
