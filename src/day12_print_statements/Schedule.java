package day12_print_statements;

import java.util.Scanner;

/*
     Task:

        Ask the user to enter which day it is
        print which class we have on that day, and the time of the class

        topic with instructor at time

        challenge:
            make each day flexible

                monday
                Monday
                mon

             reduce repeating code
 */
public class Schedule {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("What day do you want to know about? ");
        String day = input.next();
        String information = "";


        switch (day) {
            case "Monday": // Mon, monday
            case "Mon":  case "MON":   case "monday":
                information = "We have mentor sessions.";
                break;
            case "Tuesday":  case "Tue": case "Friday":
                information = "We do not have a class.";
                break;
            case "Wednesday":    case "Thursday":
                information = "We have JAVA classes stating at 7 PM.";
                 break;

            case "Saturday":
                information = "We have JAVA classes starting at 9:30 AM.";
                break;
            case "Sunday":
                information = "We have SOFTSKILLS class";
                break;
            default:
                information = "Not valid day of week";
        }

        System.out.println(information);//this corresponds to the upgraded information printed out.


        }
    }
