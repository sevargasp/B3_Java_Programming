package day45_functions_stream.functions;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        // <T t, U u, R r> --- >  BiFunction accepts TWO Objects (any) and returns ONE Object
        // abstract method: R apply(T t, U u);--------------estos son los elementos que acepta
        BiFunction <Integer, Integer, Integer> maxNumber =  (num1, num2) -> {
//y complaint at the beginning because it doesnot have return.
            return num1 > num2 ? num1 : num2;
        };


        System.out.println( maxNumber.apply(4, -6));

        System.out.println("-------------------------------");

        // make a function and accepts two List and returns a Map
        BiFunction < List<Integer>, List<String>, Map <Integer, String>> makeMap =  (list1, list2) -> {
            // [1, 2, 3]
            // ["one", "two"] --->

            Map <Integer, String> map = new HashMap<>();

            if (list1.size() != list2.size()) {
                throw new RuntimeException("Lists do have same size of elements");
            } else {

                for (int i = 0; i < list2.size(); i++) { // since this else part is for when list1 and list2 have same size, it does not matter which one to use
                    // map.put( KEY ,         VALUE    );
                    map.put( list1.get(i), list2.get(i));
                }
            }

            return map;
        };

        List <Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3));
        List <String> strList = new ArrayList<>(Arrays.asList("a", "b", "c"));

        System.out.println(makeMap.apply(numList, strList));


    }
}