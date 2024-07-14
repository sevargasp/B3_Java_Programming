package day45_functions_stream.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        // <T, U> -- > BiConsumer, accepts two any Objects and returns void (nothing)
        // abstract method: void accept(T t, U u);
        BiConsumer <String, Integer> printStringNTimes =  (str, n)->{
            for (int i = 0; i < n; i++) {
                System.out.print(str + " ");
            }
            System.out.println();
        };

        printStringNTimes.accept("java", 5);
        printStringNTimes.accept("api", 3);

        System.out.println("--------------------------------");
        Map <String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // forEach with Map - is accepting BiConsumer
        // forEach with Collection - is accepting Consumer
        map.forEach( (K, V) -> {
            System.out.println(K + " " + V);
        });

        // BiConsumer<? super K, ? super V> action --- > (K, V) -> { ........ });
        // map.forEach ---- >  will loop through map, and get each KEY and VALUE each cycle and assign them into K and V

        map.forEach( (K, V)-> {
            System.out.println(K + " has " + K.length() + " of characters");
        });

    }
}