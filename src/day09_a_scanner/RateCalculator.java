package day09_a_scanner;

import java.util.Scanner;
/*
    write a program for a rate calculator: RateCalculator
        1. asks the user to enter a  annual salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
 */

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a annual salary: $" );
        double annualSalary= input.nextDouble();

        System.out.println("Enter how many hours you work in a week: ");
        int hoursWorkly= input.nextInt();

        double hourlyRate= annualSalary/(hoursWorkly*52);


        System.out.println("Your annual salary: "+ annualSalary);
        System.out.println("You are working: "+ hoursWorkly+" hours per week");
        System.out.println("Your hourly rate is: $"+ hourlyRate);

    }
}
