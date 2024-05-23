package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);

        nums.set(0, -100); // Update the OBJECT at the index of 0
        System.out.println(nums);

        //nums.set(4, 400); // IndexOutOfBoundsException
        nums.set(nums.size()-1, -900);
        System.out.println(nums);


        ArrayList <String> list = new ArrayList<>();
        list.add("java");
        list.add("softskills");
        list.add("api");
        list.add("db");
        System.out.println(list);
        list.set(1, "selenium");
        System.out.println(list);


    }
}