package day10_if_statements;

import java.util.Scanner;

    /*
    Task: Hard code -> Dynamic

    Create a double value for the account balance. // 100
    Create a double value for how much you want to withdraw // 500

    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

 */
public class BankAccount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //ask user question
        System.out.println("What is your balance: $");
        double balance=input.nextDouble();
        System.out.println("How much do you want to withdraw: $");
        double withdraw= input.nextDouble();
balance-=withdraw;
        System.out.println("Your current balance is: $"+balance);
        if (balance<0) {
            System.out.println("overdraft"+balance) ;} else {
                System.out.println("remaining Balance "+balance);
            }

    }
}
