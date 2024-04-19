package day12_print_statements;

import java.util.Scanner;

/*
    Take a number and print the number as the word version
    1 -> one
    2 -> two
 */
public class NumberWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //int num=3;
        //Approach 1- is with multibranch if.
/*
        if(num==1){
            System.out.println("One"); } else if (num==2) {
            System.out.println("two");} else if (num==3) {
            System.out.println("Three");} else if (num == 4){     System.out.println("Four"); } else if (num == 5) {System.out.println("Five");     } else {System.out.println("Number is not between 1 and 5");}
*/// Approach - 2 - is with switch statement
        System.out.println("introduce a number from 1 to 5");

        int num=input.nextInt();
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Number is not between 1 and 5");

        }

    }

    }

