package day25_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

/*
    Min Number

    create a method that will accept an int array and return the smallest number from the array
 */
public class MinNumberInArray {
    public static void main(String[] args) {

        int [] arr = {12, 43, 12, 7, 34, 234, 543};
        System.out.println(minNumInSortedArr(arr));

        System.out.println(minNumInArr(arr));

        System.out.println(ArrayUtil.minNumInArr(arr));


        System.out.println(ArrayUtil.maxNumInSortedArr(arr));
        System.out.println(ArrayUtil.maxNumInArr(arr));
    }


    public static int minNumInSortedArr (int [] arr) {
        Arrays.sort(arr);
        return arr[0];
    }


    public static int minNumInArr (int [] arr) {

        int min = arr[0];

        for ( int eachNum : arr) {

            if (eachNum < min) {
                min = eachNum;
            }

        }

        return min;
    }

}