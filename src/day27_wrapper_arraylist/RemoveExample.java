package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();//just declaration
        System.out.println(list.size());
        System.out.println(list);

        // Let's add some data in it
        list.add("water");
        //list.add(3); // INVALID, because the datatype of my ArrayList is String.
        list.add("bread");
        list.add("juice");
        list.add("fruit");
        System.out.println(list); // [water, bread, juice, fruit]

        list.add(1, "rice");
        System.out.println(list); // [water, rice, bread, juice, fruit]

        list.remove(0);
        System.out.println(list); // [rice, bread, juice, fruit]

        System.out.println(list.remove(0));
        System.out.println(list); // [bread, juice, fruit]


        // remove the last one.
        list.remove(list.size()-1);
        System.out.println(list); // [bread, juice]


        // list.remove(12); // IndexOutOfBoundsException:


        // remove by element
        list.remove("juice");
        System.out.println(list); // [bread]

        System.out.println(list.remove("water")); // Since there was not match it returned false


        list.add("banana");
        list.add("banana");
        System.out.println(list);

        list.remove("banana"); // It will remove the FIRST matched one.
        System.out.println(list);







    }
 }

