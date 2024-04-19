package day09_a_scanner;

import java.util.Scanner;
/*
Write a program that asks the user to enter 3 angle numbers ( can be decimal numbers )
Determine if the angles make a triangle,
which means the angles add to 180.0
and Determine if the angles make a circle,
which means the angles add to 360.0*/

public class Angles {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("write the first angle number: ");
        double firstAngle= input.nextDouble();

        System.out.println( "write the second angle number: ");
        double angle2= input.nextDouble();

        System.out.println("write the third angle number");

        double angle3=input.nextDouble();

        double total= firstAngle+angle2+angle3;

        boolean isTriangle = total ==180;

        boolean isCircle= total == 360;


        System.out.println("It is a tringle: "+ isTriangle);

        System.out.println("It is a circle: "+ isCircle);

    }



    }
