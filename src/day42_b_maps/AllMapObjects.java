package day42_b_maps;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>(); //order is NOT kept, null KEY is OK
        map1.put("feyruz", "java");
        map1.put("nadir", "selenium");
        map1.put("james", "bond");
        map1.put("username", "password");
        map1.put(null, "nothing"); // null KEY is OK
        System.out.println(map1);


        Map<String, String> map2 = new LinkedHashMap<>(); // Insertion order IS kept - null KEY is OK
        map2.put("feyruz", "java");
        map2.put("nadir", "selenium");
        map2.put("james", "bond");
        map2.put("username", "password");
        map2.put(null, "nothing"); // null KEY is OK
        map2.put("test", null); // null VALUE is OK
        System.out.println(map2);


        Map<String, String> map3 = new TreeMap<>(); // KEYs Order is sorted(Ascending order) - null KEY is NOT OK
        map3.put("feyruz", "java");
        map3.put("nadir", "selenium");
        map3.put("james", "bond");
        map3.put("username", "password");
        //map3.put(null, "nothing"); // null KEY is NOT OK - NullPointerException
        map3.put("test", null); // null VALUE is OK
        System.out.println(map3);


        Map<String, String> map4 = new Hashtable<>(); //order is NOT kept, null KEY is NOT OK - null VALUE is NOT OK - It is THREAD-SAFE (SYNCHRONIZED)
        map4.put("feyruz", "java");
        map4.put("nadir", "selenium");
        map4.put("james", "bond");
        map4.put("username", "password");
        //map4.put(null, "nothing"); // null KEY is NOT OK - NullPointerException
        //map4.put("test", null); // null VALUE is NOT OK - NullPointerException
        System.out.println(map4);



    }
}