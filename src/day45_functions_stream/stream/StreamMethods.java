package day45_functions_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        // How do we create a stream - since it is not a Class or Data Structure? - we call the .stream method
        // It is a method with works with Data Structure. It has access to the other useful methods which we can "CHAIN" together


        // We will use it for "array" and "arrayList".


        // #1 - stream with array
        int [] arr = {1,2,3,4,5};
        //In order to create a stream for "array", array itself does not have a method that we can use.
        //So, we use the Arrays class which has method that work with array

        // Here we just had access to use stream() with array (we converted our array into stream) - like this it does not do anything yet.
        Arrays.stream(arr);


        // #2 - stream with arrayList
        List <Integer> list = new ArrayList<>(Arrays.asList(6,7,8,9));

        // Here we will convert arrayList to stream
        list.stream();


        //--------------------------------------------------------------

        //STREAM METHODS
        // #1.1 - distinct(); - with List

        List <Integer> list2 = new ArrayList<>(Arrays.asList(6,7,8,9, 8, 2, 1, 6, 3, 52, 324, 645));
        System.out.println( "Distinct Method: " +  list2.stream().distinct()   ); // Just like this it will do some action and show me the memory location

        // After we converted arrayList into Stream and did some action (distinct), we need to convert it back to arrayList
        // To do that, there is a method called "collect()"
        // This method will take the changes we made by stream and convert it back to List, Set, Map or whatever you need
        System.out.println( "Distinct Method: "  + list2.stream().distinct().collect(Collectors.toList())); // This still did not change the Data Structure
        /*
            .stream() --- > converts the list into stream
            .distinct() - > helped us to remove duplicates
            .collect(Collectors.toList()) -- > helped to convert stream back to List
         */

        System.out.println();
        System.out.println("Before stream: " + list2);
        list2 = list2.stream().distinct().collect(Collectors.toList());
        System.out.println("After stream: " + list2);


        System.out.println();
        //--------------------------------------------------------------
        // #1.2 - distinct(); - with array
        // We will convert array into stream, then do some action, then convert it back to array
        // To conver stream back to array we do not use .collect(), we use toArray();

        int [] arr2 = {1,2,3,4,5, 5, 3, 1, 45, 2, 77, 8, 77};
        System.out.println( Arrays.stream(arr2).distinct() ); // Just like this it will do some action and show me the memory location
        System.out.println("Array Before stream: " + Arrays.toString(arr2));
        arr2 = Arrays.stream(arr2).distinct().toArray(); // re-assign after doing some actions with stream
        System.out.println("Array After stream: " + Arrays.toString(arr2));



        System.out.println();
        //--------------------------------------------------------------
        // #4 - skip()

        List <Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println( list3.stream().skip(4).collect(Collectors.toList()) );
        System.out.println(list3.size()); // 10
        System.out.println( list3.stream().skip(13).collect(Collectors.toList()) ); // will return empty

        list3 = list3.stream().skip(13).collect(Collectors.toList());

        String [] arr3 = {"a","b","c","d","e","f"};
        System.out.println( Arrays.toString(Arrays.stream(arr3).skip(3).toArray()) );




        System.out.println();
        //--------------------------------------------------------------
        // #5 - limit() - opposite of skip()
        ArrayList <Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(  list4.stream().limit(6).collect(Collectors.toList())  );
        System.out.println(list4.stream().limit(7).skip(3).collect(Collectors.toList()));



        System.out.println();
        //--------------------------------------------------------------
        // #6 - count() - number of elements
        List <Integer> list5 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 5, 6, 4, 5));
        // get me how many different numbers we have in list
        System.out.println(list5.size());
        System.out.println(list5.stream().count());
        System.out.println(list5.stream().distinct().count());


        //Task: how many different character I have in String ?
        String str = "aaaabbbbccccdddeeeffffggg";
        System.out.println(Arrays.stream(str.split("")).distinct().count()); // total number of different character
        System.out.println(Arrays.toString(Arrays.stream(str.split("")).distinct().toArray()));
        System.out.println(Arrays.stream(str.split("")).distinct().collect(Collectors.toList()));

        /*
            you can use stream with ANT TYPE of COLLECTION (List, Set) - Map
            ArrayList is the one mostly used, that is why we practice with that.
         */

    }
}
