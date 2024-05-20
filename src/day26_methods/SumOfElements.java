package day26_methods;


public class SumOfElements {
    public static void main(String[] args) {

        int [] arr = {1, 3, 4, 5, 7};
        System.out.println(sum(arr));


        System.out.println(sum(new int [] {1, 2, 3 , 5, 56}));
        System.out.println(sum(new int [] {1345, 2, 454 , 5, 5623}));

        System.out.println(sum( 2, 34, 345, 654, 34, 23));

        System.out.println(sum(arr));

        sum("java", "loop", "api");

        System.out.println( contains(2, 464, 3456, 456, 34, 345, 654, 34, 23, 3, 2, 23, 543));
        System.out.println( contains(20, 464, 3456, 456, 34, 345, 654, 34, 23, 3, 2, 23, 543));


    }

    public static boolean contains (int num, int ... arr) {

        //boolean result = false;
        for ( int eachNum : arr) {
            if (eachNum == num){
                return true;
            }
        }

        return false;
    }



    // Create a method that accepts in array and sums up all the elements in the array and return that total
    // with the help of var-args - IT IS ONLY FOR ARRAY
    public static int sum (int ... nums) {

        int sum = 0;
        for ( int each : nums) {
            sum += each;
        }
        return sum;
    }



//    // Create a method that accepts in array and sums up all the elements in the array and return that total
//    // This with NORMAL VERSION accepting array
//    public static int sum (int [] nums) {
//
//        int sum = 0;
//        for ( int each : nums) {
//            sum += each;
//        }
//        return sum;
//    }


    public static void sum (String ... word) {

        for ( String ea : word) {
            System.out.println(ea);
        }
    }


}