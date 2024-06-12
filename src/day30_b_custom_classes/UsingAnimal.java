package day30_b_custom_classes;

import my_utilities.StringUtil;

public class UsingAnimal {

    public static void main(String[] args) {

        Animal animal1 = new Animal();

        System.out.println(new Animal().population); //


        animal1.population = 10000000;
        animal1.species = "Bird";


        System.out.println(animal1.population);
        System.out.println(animal1.species);

        System.out.println(new Animal().species);

        new Animal().population = 1000;

        System.out.println(new Animal().population);


        System.out.println("------------");
        // To be able to print object, I have to have toString method declared in Class
        System.out.println(animal1);



        // To be able to print object, I have to have toString method declared in Class
        System.out.println(new Animal());//si yo comento al lado de la clase animal al metodo instanciado me imprimira memmory location.










    }
}