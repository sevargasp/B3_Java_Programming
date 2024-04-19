package day09_a_scanner;

import java.util.Scanner;
/*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.

 */
public class Order {
    public static void main(String[] args) {
        //object reference+ object parameter
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String productName= input.nextLine();

        System.out.println("Enter the price: $");
        double price= input.nextDouble();

        System.out.println("Enter the quantity of "+ productName+": ");
        int quantity= input.nextInt();

        input.nextLine();
         System.out.println("Enter your full name: ");
        String fullName= input.nextLine();


        double totalCost= price*quantity ;

        System.out.println(fullName+ " your order for "+quantity+" "+productName+" has been placed. Your total cost is: $"+ totalCost);




    }
}
