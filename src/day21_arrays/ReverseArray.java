package day21_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
       /*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
        [1, 2, 3, 4, 5]
    Output:
        [5, 4, 3, 2, 1]

 */
        int [] array= {1,2,3,4,5};
        int [] reversedNumbers=new int[array.length];//de esta manera me aseguro que tengo los mismos contenedores. 

//        System.out.println(Arrays.toString(array)); this print elements

        for (int i = 0; i < array.length; i++) {//no importa cual length le ponga porque ambos tienen la misma longitud
            reversedNumbers[array.length-1-i]=array[i];

            
        }
        System.out.println("array = " + (Arrays.toString(array)));
        System.out.println("reversedNumbers = " + (Arrays.toString(reversedNumbers)));


    }
}
