package day25_methods;

import my_utilities.ArrayUtil;

/*
    Contains

    create a method that will accept an int array and an int number. Check and return if the given number is in the array.
 */
public class ContainArray {
    public static void main(String[] args) {
        int [] nums = {234, 45, 23, 878, 345, 23, 1, 68};
        int num = 3;

        System.out.println(contains(nums, num));
        System.out.println(contains(nums, 45));

//        System.out.println(ArrayUtil.contains(nums, 1));

    }

    public static boolean contains (int [] arr, int num) {

        //boolean result = false;
        for ( int eachNum : arr) {
            if (eachNum == num){
                return true;
            }
        }

        return false;
    }
}