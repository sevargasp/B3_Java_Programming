package day09_a_scanner;

import java.util.Scanner;
/*
    Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
 */
public class DivisibleBy {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();

        boolean isDivisibleBy2=num % 2==0;
        boolean isDivisibleBy3=num % 3==0;
        boolean isDivisibleBy5=num % 5==0;
        System.out.println("The number " +num+" is divisible by: "+isDivisibleBy2);
        System.out.println("The number " +num+" is divisible by: " + isDivisibleBy3);
        System.out.println("The number " +num+" is divisible by: " + isDivisibleBy5);
    }
}
