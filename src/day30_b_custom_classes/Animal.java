package day30_b_custom_classes;

public class Animal {

    // INSTANCE VARIABLES
    String species;
    long population;



    // This is a SPECIAL method. This will help up top print object directly.
    // Once we print the Object directly, it will call this method behind scene
    // If you do nto have this method declared, it will print some memory location.
    public String toString(){
        String print = "Species: " + species + "\nPopulation: " + population;
        return print;
    }



}