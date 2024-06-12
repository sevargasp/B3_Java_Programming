package day24_methods;

import java.util.Scanner;

public class Greeting {

    public static void hello (String name) { // Parameterized method - meaning this method accepts parameter in the parenthesis -- >  String name = "Tom";
        // String name = "Tom";
        System.out.println("Hello " + name + "!. How are you? ");
        System.out.println(name.toUpperCase());
    }


    public static void main(String[] args) {

        hello("Tom"); // When I call hello(String str); method, I am passing "Tom" as argument
        hello("Jake");


        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String name2 = key.nextLine();

        //System.out.println("Hello " + name + "!. How are you? ");
        hello(name2);// name2 - argument can be same as the method parameter name




    }
}