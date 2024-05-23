package day26_methods;

import my_utilities.ArrayUtil;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {12, 3, 5, 73, 13, 2, 5};
        int num = 5;
        String []a={"casa","vaca","caballo","algoritmo"};
        System.out.println(indexOf(arr, 5));

        int indexOfcasa= ArrayUtil.indexOf(a,"casa");
        System.out.println(indexOfcasa
        );
    }
    public static int indexOf(int []arr, int num){

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == num) {
                return i;

            }


        }
        return -1;
    }

    public static int indexOf(String [] arr, String word){

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i].equals(word)) {
                return i;

            }


        }
        return -1;
    }

}
