package day12_print_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("***WELCOME to ATM*** \n\nPlease, insert your card.\nThen type your pincode");

        int userInputPin= input.nextInt();
        int expectedPin=6789;
        double balance= 1_000_000;
        if(userInputPin==expectedPin) {
            System.out.println("You are logged in");
            System.out.println("Select a number for your need: ");
            System.out.println("\t1 - Check Balance");
            System.out.println("\t2 - withdraw");
            System.out.println("\t3 - Deposit");
            System.out.println("\n Your choice: ");

            int option= input.nextInt();

            if (option==1) {
                System.out.println("Your balance is $ " + balance);
            }else if(option==2) {
                System.out.println("How much do you want to withdraw? $ ");
                double withdrawAmount = input.nextDouble();
                System.out.println("Stand by ... Withdrawing $ " + withdrawAmount);
                balance -= withdrawAmount;
            }else if (option==3) {
                System.out.println("Please, insert the money: $");

                double deposit = input.nextDouble();
                balance += deposit;
            }else {
                System.out.println("Invalid selection. Exiting the account");}

            }
        else {
            System.out.println("Invalid pincode. Come back tomorrow. ");

            }


        }

    }

