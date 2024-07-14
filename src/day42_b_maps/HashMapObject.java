package day42_b_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        //Map works with KEY - VALUE
        Map <Integer, String> map = new HashMap<>();
        map.put(1, "one"); // we use put(); method to add elements
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");

        System.out.println(map); // Insertion order in HashMap is Random


        //Q: How do we read key/value from map
        System.out.println(map.get(10)); // This is NOT index. It is the KEY object

        String value = map.get(3); // This returns the value assigned to KEY (3) -- > "three"
        System.out.println(value);


        //Q: How do I remove the KEY/VALUE
        map.remove(1); // remove(KEY); will remove teh ENTRY (KEY+VALUE) which is associated with KEY (1)
        System.out.println(map);


        //Q: How can I check if the specific KEY is in the Map
        //A: .containsKey(KEY);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));


        //Q: How can I check if the specific VALUE is in the Map
        //A: containsValue(VALUE);
        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));
        //System.out.println(map.containsValue(10)); //since containsValue(Object obj) method accepts as Object, sending 10 is fine, but will return false


        // HashMap can accept null -- > as KEY and as VALUE
        map.put(null, null);
        System.out.println(map);


        map.put(5, "fivefive"); // Since KEY in map, does NOT allow duplicates, it will update the value of the KEY if it already exist
        System.out.println(map);

        map.put(null, "java"); // null KEY already existed, so I updated VALUE
        System.out.println(map);

        map.put(null, "api"); // null KEY already existed, so I updated VALUE
        System.out.println(map);


        map.put(3, "March");
        System.out.println(map);

        map.put(7, "March"); // Dupicate VALUEs are ok but duplicate KEYs are not ok
        System.out.println(map);






    }
}