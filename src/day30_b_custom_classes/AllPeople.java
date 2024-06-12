package day30_b_custom_classes;


import java.util.ArrayList;
import java.util.Scanner;

public class AllPeople {
    public static void main(String[] args) {

        // These are not VALID ways to reach INSTANCE VARIBALES
        //System.out.println(name);
        //System.out.println(age);
        //System.out.println(height);
        //System.out.println(isMarried);


        // Sample of the object we have learned
        Scanner input = new Scanner(System.in);
        String str = new String("Hello");
        ArrayList <String> list = new ArrayList<>();


        // Object Reference = actual Object
        Person person1 = new Person();
        Person person2 = new Person();

        // To access the INSTANCE variables, I need to create an object and use the object reference with DOT operator
        System.out.println("Person 1 info:");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);

        System.out.println();
        System.out.println("Person 2 info:");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);


        // Now, lets have / assign some values/data for Person1
        person1.name = "Tom";
        person1.age = 40;
        person1.height = 5.7;
        person1.isMarried = true;


        System.out.println("----------");
        // To access the INSTANCE variables, I need to create an object and use the object reference with DOT operator
        System.out.println("Person 1 info:");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);

        System.out.println();
        System.out.println("Person 2 info:");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);



        // Now, lets have / assign some values/data for Person2
        person2.name = "Micky";
        person2.age = 35;
        person2.height = 6.2;
        person2.isMarried = false;



        System.out.println("----------");
        // To access the INSTANCE variables, I need to create an object and use the object reference with DOT operator
        System.out.println("Person 1 info:");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);

        System.out.println();
        System.out.println("Person 2 info:");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);





    }
}