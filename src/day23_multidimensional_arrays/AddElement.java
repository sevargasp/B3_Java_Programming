package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {/*
    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

    Ex:
        {45, 123, 62}
        adding 100
        {45, 123, 62, 100}
 */


    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("How many elements in your first array yo want to have: ");
        int firstArraySize=key.nextInt();

        int[]firstArr= new int[firstArraySize];//3
        for (int i = 0; i < firstArr.length; i++) {
            System.out.println("Enter you data/value: ");
            firstArr[i]= key.nextInt();

        }
        System.out.println("First Array: "+ Arrays.toString(firstArr));
        System.out.println( "How many more elements do you want to add to the First Array");

//        int numsToAdd= key.nextInt();//2
        int []secondArr= Arrays.copyOf(firstArr, firstArr.length+key.nextInt());


        for (int i = firstArr.length; i < secondArr.length ; i++) {//[23,66,77
            System.out.println("Enter you data/value: ");
               secondArr[i]= key.nextInt();

        }
        System.out.println("Second Array: "+Arrays.toString(secondArr));


    }
}
