package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year = "2024";
        // String year = "2024b"; // NumberFormatException: For input string: "2024b" -- >  cannot be converted into number

        // normal concatenation
        System.out.println("Current Year: " + year);
        System.out.println("Next year will be: " + (year + 1));//this is a string

        int yearInNum = Integer.parseInt(year); // int yearInNum = 2024;
        System.out.println("Current Year: " + yearInNum);
        System.out.println("Next year will be: " + (yearInNum + 1));


        System.out.println("----------------------------------");
        Scanner key = new Scanner(System.in);
        System.out.print("Enter you message in this format: I am $x years old: ");
        String str = key.nextLine(); // I am 30 years old

        // In 5 years, I will be $x+5 years old
//lo que hace es reducir en una sola linea toda la informacion
//        String [] arr= str.split(" ");
//        arr[2]; lo anterior se resume en la siguiente linea de codigo.
        String age = str.split(" ")[2]; // "30" ---- > // I am 30 years old -- > ["I", "am", "30", "years", "old"] [2]
        int ageInNum = Integer.parseInt(age);
        //System.out.println("In 5 years, I will be " + (age+5) + " years old"); //305
        System.out.println("In 5 years, I will be " + (ageInNum+5) + " years old"); //35





    }
}