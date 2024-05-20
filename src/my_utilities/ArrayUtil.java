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

        /**
         * this returns new array with added element at the end
         * @param originArr is an array where we will add an element to the end.
         * @param elemToAdd is the element we will add to the end
         * @returns: new array with added element.
         */
        public static int []  addElemInArr (int []originArr, int elemToAdd){

            int [] newArray= Arrays.copyOf(originArr,originArr.length+1);

            newArray[newArray.length-1]=elemToAdd;

            return newArray;
        }

        /**
         * This method returns the array with the new value by through the for loop
         * @param originArr initial array
         * @param elemToAdd the element to add at the before array
         * @return final array with the element already added.
         */

        public static int [] addElemInArr2 (int []originArr, int elemToAdd) {

            int []newArray = new int[originArr.length+1];
            for (int i = 0; i < originArr.length; i++) {
                newArray[i]=originArr[i];

            }
            newArray[newArray.length-1]=elemToAdd;


            return newArray;

        }
        /**
         * This returns new array with the fusion of two Arrays, the first one followed by the second one
         * @param a first array
         * @param b second array
         * @returns one array with the length of both previous ones
         */

        public static int [] twoArraysInOne(int []a, int []b){
            int []c= Arrays.copyOf(a,(a.length+ b.length));
            System.out.println(Arrays.toString(c));

            for (int i =0 ; i < b.length ; i++) {
                c[i+ a.length]=b[i];

            }
            System.out.println(Arrays.toString(c));
            return c;
        }

        /**
         * This method finds the first matched element's of int array
         * @param arr is the parameter where we will check for the element
         * @param num is the parameter where we will check it there is match to it.
         * @return the index if there is a match and -1 if there is no match.
         */
        public static int indexOf(int []arr, int num){

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] == num) {
                    return i;

                }


            }
            return -1;
        }

        /**
         * This method finds the first matched element's of String array
         * @param arr is the parameter where we will check for the element
         * @param word is the parameter where we will check it there is match to it.
         * @return the index if there is a match and -1 if there is no match.
         */
        public static int indexOf(String [] arr, String word){

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i].equals(word)) {
                    return i;

                }


            }
            return -1;
        }

        /**
         * This method summ up all the elements in int array
         * @param nums is the array where i get all the elements to sum up
         * @return the total of the all elements summed up
         */
        public static int sum (int ... nums) {

            int sum = 0;
            for ( int each : nums) {
                sum += each;
            }
            return sum;
        }

    }
