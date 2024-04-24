package day15_string;

import java.util.Scanner;

/*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */
public class Initials {
    public static void main(String[] args) {
        Scanner key= new Scanner (System.in);
        System.out.println("Please, enter yoour first name: ");
        String firstName= key.next().toUpperCase().trim();
        System.out.println("Please, enter your last name: ");
        String lastName= key.next().toUpperCase().trim();

        char first=firstName.charAt(0);//i can save as a string but i would need concatenatio.
        System.out.println(firstName.charAt(0));
        char last=lastName.charAt(8);
        System.out.println(""+first+last);//i must write down double wuote, because the problem would be



    }
}
