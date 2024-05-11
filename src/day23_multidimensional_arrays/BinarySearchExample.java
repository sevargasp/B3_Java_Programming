package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int []arr  ={4, 10, 30, 100};
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 100));
        System.out.println(Arrays.binarySearch(arr, 200));
// we can write  a code check for the first matched index
        int []numb={4,55, 10,-1, 30, 100,150};
        int numerito=6;
        int count=0;
        for (int i = 0; i < numb.length; i++) {

            if (numb[i] == numerito) {
                System.out.println("Your first matched index: " + i);
                break;

            } else {count++;

//                System.out.println("There was no match");//primer manera de resolver

            }


        } if (count==numb.length){
            System.out.println("There was no match(it is the second option");
    }
}
}


