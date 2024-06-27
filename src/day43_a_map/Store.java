package day43_a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.9); // (id, itemName)
        store.put("Coffee", 2.5);
        store.put("Apple", 0.99);
        store.put("Bread", 2.25);
        store.put("Milk", 3.89);

        /*
            Store Inventory
                Item: $itemName for $$price
                .....
         */
        // OPTION 1
        System.out.println("Store Inventory");
        for (String eachItem : store.keySet()) { //We used .keySet() method to get all the KEYs and loop through them to get each KEY
            System.out.println("\tItem: " + eachItem + " for $" + store.get(eachItem)); // In print statement, we used each KEY that we are getting each cycle, and getting linked VALUE to that KEY
        }

        System.out.println("------------------");
        // OPTION 2
        System.out.println("Store Inventory");
        for(Map.Entry<String, Double> eachPair: store.entrySet()) {
            System.out.println("\tItem: " + eachPair.getKey() + " for $" + eachPair.getValue());
        }

        System.out.println("------------------");


        // How to get all the values?
        System.out.println(store.values()); // will return all the values as Collection




        System.out.println("------------------");
        System.out.println("What item do you want?");
        Scanner scan = new Scanner(System.in);
        String userItem = scan.nextLine();

        System.out.println(  store.containsKey(userItem) ? userItem + " is in stock for $" + store.get(userItem) : userItem + " is not available in stock" );


    }
}
/*
en el primer loop
en la segunda opcion, estoy haciendo loop since the pair elements. con entry y despues se da el get key y el get value
 */