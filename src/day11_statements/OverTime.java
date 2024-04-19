package day11_statements;

import java.util.Scanner;
/*

    create a double variable for your hourly rate
    create a double variable for the number of hours worked per week

    calculate your net pay, with consideration of overtime pay

        if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
            (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
 */
public class OverTime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Write your hourly rate:");
        double hourlyRate= input.nextDouble();

        System.out.println("Enter your number of hours worked per week:");
        double numOfHours= input.nextDouble();


        double netPay;
        String message="";

        if (numOfHours>40) {/* This is because the normal payment would be the normal 40 hours  multiplied by hour rate. 43 hours ----> 40 * regular rate + 3(extra hours)*overtimeRate*/
            netPay=40 * hourlyRate;
            netPay=((40* hourlyRate) + (numOfHours-40/* this is because I can calculate the normal hours*/)*(hourlyRate*1.5));//regular 40 hours +overtime calculation     */
            message= "You worked "+numOfHours+" hours at a rate of "+hourlyRate+ ". Since you have overtime, your total pay is $"+netPay;} else {
            netPay=numOfHours* hourlyRate;
            message="You worked"+ numOfHours+" hours ar a rate of "+hourlyRate+ ". There was no OVERTIME. You total pay is $ "+ netPay;}
        System.out.println(message);


    }
}
