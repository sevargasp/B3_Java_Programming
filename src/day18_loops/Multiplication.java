package day18_loops;

import java.util.Scanner;

/*

    Task:
        declare and assign a number

        print all the multiplication results for 1 through 10

        Ex:
            4

            4 x 1 = 4
            4 x 2 = 8
            ..
            4 x 10 = 40

 */
public class Multiplication {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=key.nextInt();//hardcoded
        for (int i = 1; i < 11; i++) {
            System.out.println(num +"*"+ i+" = "+(num*i));

        }
    }
}
