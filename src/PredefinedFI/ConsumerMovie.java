/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author singh
 */
public class ConsumerMovie {
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<>();
        populate(list);
        
        Consumer<Movie> c = m -> {
                                System.out.println("Movie Name : "+m.name);
                                System.out.println("Hero Name : "+m.hero);
                                System.out.println("Heroine Name : "+m.heroine);
                                System.out.println();
        };
        
        for(Movie m : list)
        {
            c.accept(m);
        }
    }
 
    public static void populate(ArrayList<Movie> list)
    {
        list.add(new Movie("Bahubali", "Prabhas", "Anushka"));
        list.add(new Movie("Dangal", "Amir", "Famina"));
        list.add(new Movie("Sultan", "Salman", "Anushka"));
        list.add(new Movie("Zero", "Shaharukh", "Katrina"));
    }
}
