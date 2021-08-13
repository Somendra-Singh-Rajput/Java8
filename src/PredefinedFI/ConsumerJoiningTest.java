/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

import java.util.function.Consumer;

/**
 *
 * @author singh
 */
public class ConsumerJoiningTest {
    
    /*
    *This program shows the joining of Consumer Interface using it's default method andThen().
    *
    */
    public static void main(String[] args)    
    {
        Consumer<Movie> c1 = m -> System.out.println("Movie ready to release is : "+m.name);
        Consumer<Movie> c2 = m -> System.out.println("Movie is released actor in this movie : "+m.hero);
        Consumer<Movie> c3 = m -> System.out.println("Movie infomration storing in database is : "+m.name);
        
        Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);
        
        Movie m1 = new Movie("Bahubali-2","Prabhas","Anushka");
        chainedC.accept(m1);
    }
}
