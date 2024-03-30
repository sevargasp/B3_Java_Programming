package day06_a_arithmetic_operators;

public class TypeCasting {public static void main(String[]args){

    byte b= 40;
    int i=b; //THE BYTE VALUE IS automatically converted into int, because byte is SMALLER THAN INT

    int i2=100;
   // byte b2= i2 //boxes example, it shows error because we are trying to keep the whole box (int into byte,
    // no the value by itself)
    //byte b3=100; // Here100 is assigned to byte. We know that byte can hold 100

    int i3=130;
    byte b3=(byte)i3;//

    int in4=500;
    long l4=in4;
    System.out.println(l4);

    long l5= 200;
    int i5=(int)l5;

    double d6=50;
    int i6 =(int)d6;
    System.out.println(d6);

    double d7 = 60.7;
    int i7=(int)d7; //there is a data loss
    System.out.println(i7);

    double d8=40.8;
 //   int i8=d8;
    int i8=(int)d8;
    System.out.println(i8);

}
}
