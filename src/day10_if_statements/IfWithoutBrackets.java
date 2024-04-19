package day10_if_statements;

public class IfWithoutBrackets  {
    public static void main(String[] args) {
        if(4> 2){
            System.out.println("Hello");
            System.out.println("Bye");}


        if (1<2)// it works only with ONE STATEMENT
            System.out.println("Hello2");
            System.out.println("Bye2");

        if (10%5==0){
            System.out.println("divisible");}else {
            System.out.println("NOT divisible");
        }
        if (10%5==0) System.out.println("divisible");
        else System.out.println("NOT divisible");
    }
}
