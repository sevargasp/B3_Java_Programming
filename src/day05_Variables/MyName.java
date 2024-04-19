package day05_Variables;

public class MyName {
    public static void main(String []args) {
        char first='s'; char second='e'; char third='r'; char fourth='g'; char fifth='i'; char six='o';
        System.out.println(first);
        System.out.println("first = "+ first);
        System.out.println("second + "+ second);
        System.out.println("third = " + third);
        System.out.println("fourth = " + fourth);
        System.out.println("fifth = " + fifth);
        System.out.println("six = " + six);

        System.out.println();
        System.out.println(first+second+third+fourth+fifth+six);

        //String name= first+second+third+fourth+fifth+six; I can not print because is an int value

        String name= ""+ first+second+third+fourth+fifth+six;

        System.out.println(name);

        char letter= 1243;
        System.out.println(letter);
        letter= 43904;
        System.out.println(letter);







    }
}
