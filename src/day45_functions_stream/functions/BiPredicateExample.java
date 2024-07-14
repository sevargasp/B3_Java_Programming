package day45_functions_stream.functions;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        // <T, U> --- > accepts two Objects (any), and returns boolean -- > abstract method name: boolean test(T t, U u);
        BiPredicate <Integer [], Integer> contains = (arr, num) -> {

            for ( Integer each : arr){
                if (each == num){ // if this is true, my array contains the num, so we return true and end the loop and implementation
                    return true;
                }
            }
            return false;


        };


        // Another way to do the implementation
        BiPredicate <Integer [], Integer> contains2 = (arr, num) -> {
            return Arrays.asList(arr).contains(num);
        };


        Integer [] arr = {1,2,3,4,5};
        System.out.println( contains.test(arr, 56) );
        System.out.println( contains2.test(arr, 5) );


        System.out.println("-------------------");


        // anagram - two words have same amount and same characters (not necessarily in the same order)
        // listen -- silent

        BiPredicate <String, String> isAnagram = (str1, str2) -> {

            char [] arr1 = str1.toCharArray(); // ['l', 'i', 's', 't', 'e', 'n']
            char [] arr2 = str2.toCharArray(); // ['s', 'i', 'l', 'e', 'n', 't']
            Arrays.sort(arr1);
            Arrays.sort(arr2);



            return  Arrays.equals(arr1, arr2); // compares exact order and number of elements

        };


        System.out.println(isAnagram.test("listen", "silent"));
        System.out.println(isAnagram.test("listen", "silentr"));
        System.out.println(isAnagram.test("listen", "rentis"));
    }
}