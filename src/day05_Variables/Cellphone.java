package day05_Variables;

import java.sql.SQLOutput;

/*
    create a class CellPhone
    create a main method
    declare and assign these variables:
        brand, model, color, price, storage, hasCamera, sim(char A, B, C)

    Print all the variables

        sample data: apple, iphone 10, black, 1000.99, 128, true, A
 */
public class Cellphone {
    public static void main (String []args){

        //declare and assign variables
        String brand="Apple";
        String model ="Iphone 14 Pro";
        String color= "Red";
        double price= 799.99;
        int storage= 256; //because is a whole number
        boolean hasCamera= true;
        char sim= 'A';


        System.out.println("I have an $model from $brand"); //just to refers it
        System.out.println("I have an " +model+ " from "+ brand);

        System.out.println("it came in the color $color and it has $storage GB");//draft
        System.out.println("it came in the color " + color + " and it has "+ storage +"GB");

        System.out.println("For the sim type" +sim+ "with a camera: " + hasCamera+ ", the total price is " + price);
        System.out.println();

        String fullMessage= "I have an "+ model + "from" +brand+ ". \nIt came in the color "+ color+ " and it has"+
                storage+ "GB. "+ "\nFor the sim type" + sim + "with a camera: " + hasCamera+
                ", the total price is " + price;

        System.out.println(fullMessage);




    }
}
