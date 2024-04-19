package day11_statements;

import java.util.Scanner;

/* declare and assign 3 int variables
between the 3 numbers find the print the biggest one
 */
public class Biggest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        System.out.print("\tnumber 1: ");
        int num1=input.nextInt();
        System.out.print("\tnumber 2: ");
        int num2=input.nextInt();
        System.out.print("\tnumber 3: ");
        int num3=input.nextInt();

        //print the biggest
        if (num1> num2 && num1> num3){
            System.out.println("The biggest number that you have introduced is "+ num1);} else if (num2>num1 && num2> num3){
            System.out.println("The biggest number that you have introduced is "+num2);} else if (num3>num2 && num3> num1) {
            System.out.println("The biggest number that you have introduced is "+num3);}else {
            System.out.println("all same");


        }

    }
}
