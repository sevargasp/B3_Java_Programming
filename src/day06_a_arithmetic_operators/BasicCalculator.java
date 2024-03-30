package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[]args){
        double num1 = 7; double num2= 5;

        double addition= num1+num2;
        double subtraction=num1-num2;
        double multiplication=num1  * num2;
        double division= num1/num2;

        double remainder= num1 % num2;// whatever is not divisible will be the remainder.



        System.out.println(num1+" + "+ num2+ " = "+ addition);

        System.out.println(num1+" - "+ num2+ " = "+ subtraction);
        System.out.println(num1+" * "+ num2+ " = "+ multiplication);
        System.out.println(num1+" / "+ num2+ " = "+ division);
        System.out.println(num1+" % "+ num2+ " % "+ remainder);//whatever is not divisible will be the remainder.

        //reassigned the variables
        num1= 13;
        num2=5;
        System.out.println(num1+" % "+ num2+ " = "+ remainder);//whatever is not divisible will be the remainder.




        int n1= 7;
        int n2= 5;
        int result = n1/n2;

        System.out.println(result);// the result is 1, because of the datatype is whole number container.



    }
    }

