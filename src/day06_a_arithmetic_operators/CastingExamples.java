package day06_a_arithmetic_operators;

public class CastingExamples {public static void main(String[]args){
    int num1= 40;
    float num2= num1;
    System.out.println(num1);
    System.out.println(num2);

    float num3= 10.5F;
    short num4=(short)num3; //short ins smaller than float. we need CASTING - EXPLICIT CASTING/MANUAL CASTING/NARROWING CASTING - DATA LOSS
    //float num3= 10.5F;
    //short num4=(int)num3; it is an error because int is bigger than short, so it is no able to support it.
    System.out.println(num4);


    float num5= 300;
    byte num6=(byte)num5; //short ins smaller than float. we need CASTING - EXPLICIT CASTING/MANUAL CASTING/NARROWING CASTING - DATA LOSS
    System.out.println(num6);


    //I can convert char to int - because, each character has a number assigned to it.
    //so, I am actually, converting the number datatype to number datatype.
    char letter='A';
    int letterInt=letter;//no need to write int, because its capacity is suitable.

    System.out.println('B');
    System.out.println((int)'B');
    //whats the number inside with (int)



}
}
