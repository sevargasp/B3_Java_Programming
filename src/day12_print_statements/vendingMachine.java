package day12_print_statements;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Welcome to the vending machine. ");
        System.out.println("Please, select one of the following: \n\tDrinks\n\tSnacks\n\tGums");
        System.out.println("Select: ");
        String selectItem = key.next();
        String item= "";

        switch(selectItem) {
            case "Drinks":
                System.out.println("You have selected Drinks. \nChoose you drinks by pressing number: \n\t1 - Water\n\t2 - Soda\n\t3 -  Juice");
                int drinkOptionNum = key.nextInt();
                if (drinkOptionNum == 1) {
                    item = "Water";
                } else if (drinkOptionNum == 2) {
                    item = "Soda";
                } else if (drinkOptionNum == 3) {
                    item = "Juice";
                } else {
                    System.out.println("Invalid number");
                }
                break;
            case "Snacks":
                System.out.println("You have selected Snacks. \nChoose your snacks by pressing number: \n\t1 - Candies\n\t2 - Chips\n\t3 -  Cookies");

                int snackOptionNum = key.nextInt();
                if (snackOptionNum == 1) {
                    item = "Candies";
                } else if (snackOptionNum == 2) {
                    item = "Chips";
                } else if (snackOptionNum == 3) {
                    item = "Cookies";
                } else {
                    System.out.println("Invalid number");
                }
                break;

            case "Gums":
                System.out.println("You have selected gums. \nChoose your gums by pressing number: \n\t1 - Mentos\n\t2 - Love\n\t3 -  Turbo");

                int gumOptionNum = key.nextInt();
                if (gumOptionNum == 1) {
                    item = "Mentos";
                } else if (gumOptionNum == 2) {
                    item = "love";
                } else if (gumOptionNum == 3) {
                    item = "Turbo";
                } else {
                    System.out.println("Invalid number");
                }break;

            default:
                System.out.println("Not valid option");
                }//end of the switch statement

    }//end of the main method
}//end of the class
