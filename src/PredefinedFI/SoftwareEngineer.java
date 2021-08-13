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
public class SoftwareEngineer {
    String name;
    int age;
    Boolean isHavingGf;

    public SoftwareEngineer(String name, int age, Boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" + "name=" + name + '}';
    }
}
