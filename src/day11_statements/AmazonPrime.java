package day11_statements;

/*
Task:
    declare and assign a price variable
    declare and assign a boolean - hasPrime variable

    possible outputs:

        prime member:
            Eligible for 2 -day shipping

        not prime and item price is more than or equal 25:
            Eligible for regular free shipping

        not prime and item price is less than 25:
            Not eligible for free shipping. Shipping fee: 3.99

 */

public class AmazonPrime {
    public static void main(String[] args) {
        double price= 24.99;
        boolean hasPrime= false;
        /*1*/
        if(hasPrime){
            System.out.println("Eligible for 2 day shipping");

        /*2*/
        }else/*This is false, therefore it will be executed */ { if(price>=25.0){/*I've created other single if statement inside to the main else*/
            System.out.println("Eligible for regular free shipping");}else{
            System.out.println("Not eligible for free shipping. Shipping fee: "+(price+3.99));}
        }

    }
}
