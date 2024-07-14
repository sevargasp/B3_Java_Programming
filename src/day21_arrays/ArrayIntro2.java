package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[4];
        System.out.println(Arrays.toString(arr)); //
        System.out.println(arr.length);

        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr));

        double price = 1.99;
        int quantity  = 5;

        arr[1] = price * quantity;
        System.out.println(Arrays.toString(arr));


        arr[2] = 10.99;
        arr[3] = 50;
        System.out.println(Arrays.toString(arr));



        // reassing
        arr[0] = 2000;
        System.out.println(Arrays.toString(arr));

        //System.out.println(arr[4]); // The last index is 3 - ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4


        arr = new double [5]; // I created a NEW array with size of 5, now they are empty.
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr.length);
        int arrSize = arr.length;
        System.out.println(arrSize);




    }
}
