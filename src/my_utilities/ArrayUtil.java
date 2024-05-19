package my_utilities;

import java.util.Arrays;



    public class ArrayUtil {


        /**
         * This method returns the min number from array using sorted method
         * @param arr is the paramter that accepts array
         * @return the minimum number among all the numbers from array
         */
        public static int minNumInSortedArr (int [] arr) {
            Arrays.sort(arr);
            return arr[0];
        }


        /**
         * This method returns the min number from array using fori loop
         * @param arr is the paramter that accepts array
         * @return the minimum number among all the numbers from array
         */
        public static int minNumInArr (int [] arr) {

            int min = arr[0];

            for ( int eachNum : arr) {

                if (eachNum < min) {
                    min = eachNum;
                }

            }

            return min;
        }



        /**
         * This method returns the max number from array using sorted method
         * @param arr is the paramter that accepts array
         * @return the maximum number among all the numbers from array
         */


        public static int maxNumInSortedArr (int [] arr) {
            Arrays.sort(arr);
            return arr[arr.length-1];
        }


        /**
         * This method returns the max number from array using fori loop
         * @param arr is the paramter that accepts array
         * @return the maximum number among all the numbers from array
         */

        public static int maxNumInArr (int [] arr) {

            int max = arr[0];

            for ( int eachNum : arr) {

                if (eachNum > max) {
                    max = eachNum;
                }

            }

            return max;
        }
        /**
         * This method checks if the given number exists in the array
         * @param arr is the given array to be checked
         * @param num is the given number to check is it exists in array
         * @return boolean if given num exists in array or not.
         */
        public static boolean contains (int [] arr, int num) {

            //boolean result = false;
            for ( int eachNum : arr) {
                if (eachNum == num){
                    return true;
                }//no lo puedo tener en else porque no iria a traves de todos los datos
            }

            return false;//Se necesita porque si no se tiene nunca va arrojar ningun resutlado.
        }
    }
