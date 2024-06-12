package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);

        System.out.println();
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());

        System.out.println();
        System.out.println("Now I clear");
        nums.clear();
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());


    }
}