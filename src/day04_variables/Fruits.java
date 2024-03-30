package day04_variables;

public class Fruits {
    public static void main(String[]args) {

        int apples = 50;
        int grapes = 100;
        int bananas=150;

        System.out.println("this is how many apples we have: 70");
        System.out.println("this is how many apples we have: "+70);//the value 70 is HARDCODED
        System.out.println(" this is how many apples we have:"+ apples);//i can move from the
        // beginning but this would be dynamically used
        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: "+ bananas);

        //REASSIGNMENT
        System.out.println("Sold out some of apples");
        apples=30; //I reassigned the value
        System.out.println("Apples after selling: "+apples);

        int price= 15;
        System.out.println("The price of my 30 apples is $15"); //this is hardcode

        System.out.println("The price of my " + apples + "apples is $" + price);










        System.out.println(70 + 70 ); //this is not concatenation
        //NOTE:Anything after FIRST String is CONCATENATION
        System.out.println("50"+50); //the String is "50"= 5050
        System.out.println(10+10 + "10" + 10);

    }
}
