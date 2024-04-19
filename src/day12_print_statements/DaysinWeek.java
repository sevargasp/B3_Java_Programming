package day12_print_statements;

import java.util.Scanner;

/*
    Given a day number, find and print the day related to the number

    1- Monday
    2- Tuesday

    6- Saturday
    7- Sunday

    any other number: Not a day
 */
 public class DaysinWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a day umber [1-7]: ");
        int num = key.nextInt();
        String message = "   ";

        switch (num) {
            case 7:
                message = "Sunday";
                break;
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            default:
                message = "The number is not between 1 and 7";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Firday";
                break;
            case 6:
                message = "Saturday";
                break;

        }

        System.out.println(message);

        /*
            a = 2

            (a * 2 + a * 3 + a * 7) == a (2 + 3 + 7)
            4  + 6  + 14 = 24  == 2 * 12 = 24

         */}}