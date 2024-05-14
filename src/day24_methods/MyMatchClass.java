package day24_methods;

public class MyMatchClass {

    // Create 4 custom methods tha accepts two parameters and  calculates ADDITION, SUBTRACTION, MULTIPLICATION and DIVISION


    public static void add (double num1, double num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void minus (double num1, double num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiply (double num1, double num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }


    public static void divide (double num1, double num2){

        if(num2 == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }


    }

    public static void main(String[] args) {

        add(3, 5);
        minus(3, 5);
        multiply(3, 5);
        divide(3, 5);
        divide(3, 0); // ArithmeticException: / by zero


    }
}
