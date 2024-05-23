package day28_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(250);
        nums.add(1);
        nums.add(400);
        nums.add(500);
        nums.add(1);
        nums.add(600);
        nums.add(700);
        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);

        Integer elem = 1;//This is one way to remove, but it is longe one

        nums.remove(elem);
        System.out.println(nums);

        //nums.remove(500);// IndexOutOfBoundsException

        nums.remove((Integer)500); // Removing by OBJECT
        System.out.println(nums);

        nums.remove(Integer.valueOf("600")); // Removing by OBJECT
        System.out.println(nums);





    }
}