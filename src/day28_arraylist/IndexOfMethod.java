package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);
        System.out.println(nums);

        // It will find the index of the first match
        System.out.println(  nums.indexOf(100) );

        System.out.println( nums.indexOf(400) );

        int index = nums.indexOf(500);
        System.out.println(index);


        System.out.println( nums.lastIndexOf(100));
        nums.remove(nums.lastIndexOf(100)); // Removed by INDEX
        System.out.println(nums);


        // Hey, can you update last 100 to be -100
        nums.set(nums.lastIndexOf(100), -100);
        System.out.println(nums);


    }
}