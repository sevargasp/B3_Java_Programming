package day05_Variables;

public class RecapVariables {
    public static void main(String[]args ){
        /**
         * Variable Naming Recap
         * hell1@  -- can not have any special characters other than $ _ digit
         * 12test -- can not start with $
         * _34hello -- we can start with _
         * staticTest -- we can use it because static is added to Test, so it is not a resource.
         * static -- not valid
         * Package -- not valid
         */

        // Declare variables

        byte numberOfCoffeCups;
        double totalPriceOfCoffe;
        int totalNumbersOfStudentsInClass;
//        System.out.println(numberOfCoffeCups);
//        System.out.println(totalNumbersOfStudentsInClass);
//        System.out.println(totalPriceOfCoffe);
        //we can not USE THEM without assigned them.

        //Assign values

        numberOfCoffeCups=2;
        totalPriceOfCoffe= 10.25 ;
        totalNumbersOfStudentsInClass=100;


        //print out like this: $numberOfCoffeCups * $totalNumbersOfStudentsInClass
        //the dollar sign before is used just to refer a variable.
        //concatenation is used to print out the values of two variables in a given format above.

        System.out.println(numberOfCoffeCups +" * "+ totalNumbersOfStudentsInClass);

        //Declare and Assign
        double temperature= 15.6;
        int javaDay =5;
        System.out.println("\nToday the temperature was "+ temperature);
        System.out.println("It is Day " + javaDay+" in Java class.");







    }
}
