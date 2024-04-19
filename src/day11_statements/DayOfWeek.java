package day11_statements;

import java.util.Scanner;
/*

     Declare and assign a number (day)

         1 - Monday
         2 - Tuesday
         .
         6 - Saturday
         7 - Sunday

         Ex: 2
             Tuesday

             // website: ww.google.com

  */
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number between 1-7, each representing a day of week");
        int day= input.nextInt();

        if (day==1){ System.out.println("Monday");}
            else if (day==2){  System.out.println("Tuesday");}
            else if (day==3){    System.out.println("Wednesday");}
            else if (day==4){    System.out.println("Thursday");}
            else if(day==5){     System.out.println("Friday");}
            else if (day==6){   System.out.println("Saturday");}
            else if (day==7){   System.out.println("Sunday");}
            else{           System.out.println("There is no number like this representing a weekday");

        }
//
    }}



