package day04_variables;

public class FloatingNumbers {
    public static void main(String[]args){
        //in java you cannot store fractions. --- > 3/4
        System.out.println(3/4); // 0.75

        // how we store decimal numbers: 4.5  or 5.99
        double price  = 3.99; // this is the one that is used for DECIMAL number almost always

        float average = 0.19F;

        System.out.println(price);      // here the datatype is:                double
        System.out.println(average);    // here the datatype is:                float
        System.out.println(4.5);        // here by default the datatype is:     double
    }
}
