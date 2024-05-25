package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Remove Bad Pairs
        Create a method that will accept an Integer ArrayList and check for bad pairs. A pair is an element and the element next to it.
        A bad pair is whenever the first number in the pair is bigger then the second number. Remove any bad pairs for the ArrayList and return the ArrayList with no bad pairs
        Note: The given ArrayList will always be an even number of elements, so each number always has one pair
        @param nums - Given ArrayList of numbers @return - ArrayList of numbers
 */
public class BadPairs {


    public static ArrayList <Integer> goodPairs (ArrayList <Integer> list) { // (3, 5, 2, 64, 23, 1234, 76, 23, 45, 2, 3,  3));
        ArrayList <Integer> goodList = new ArrayList<>();
        // Bad pair -- >  i > i+1
        // Good pair -- > i <= i+1

        for (int i = 0; i < list.size(); i+=2 ) {
            if (list.get(i) <= list.get(i+1)){
                goodList.add(list.get(i));
                goodList.add(list.get(i+1));
            }
        }
        return goodList;
    }


    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 2, 64, 23, 1234, 76, 23, 45, 2, 3, 3));

        System.out.println(nums);
        System.out.println(goodPairs(nums));

    }

}