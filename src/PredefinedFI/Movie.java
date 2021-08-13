/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredefinedFI;

/**
 *
 * @author singh
 */
public class Movie {
    
    String name;
    String hero;
    String heroine;

    public Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", hero=" + hero + ", heroine=" + heroine + '}';
    }
}
