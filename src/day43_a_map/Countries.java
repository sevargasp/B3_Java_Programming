package day43_a_map;

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        // Map works with ----> KEY : VALUE
        // KEY : VALUE (ENTRY) -> data has to be PRIMITIVE (Object Type)

        // String, "String, String, String"
        // I created a HashMap that has:
        //      KEY of String type (countries)
        //      VALUE of ArrayList of String (cities)
        Map<String, ArrayList<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("New York", "New Jersey", "Virginia", "Boston")));
        countries.put("France", new ArrayList<>(Arrays.asList("Lyon", "Paris")));
        countries.put("Canada", new ArrayList<>(Arrays.asList("Toronto", "Vancouver", "Ontario")));


        //How do I print the Map
        System.out.println(countries);

        System.out.println("--------------------");
        // Print all cities which has "i" in it
        for (String eachListOfCities : countries.keySet()) {  // this will loop through the all KEYS
            System.out.println(countries.get(eachListOfCities));

            for (String eachCity : countries.get(eachListOfCities)) { // this will loop through the element of each ArrayList value
                if (eachCity.contains("i")) {
                    System.out.println(eachCity);
                }
            }
        }


        System.out.println("--------------------");
        for (ArrayList<String> eachList : countries.values()) {

            for (String eachCity : eachList) {

                if (eachCity.contains("i")) {
                    System.out.println(eachCity);
                }
            }

        }


        System.out.println("--------------------");
        // Let ask a user which city they want to visit?
        System.out.println("Which city do you want to visit?");
        Scanner input = new Scanner(System.in);
        String userWishCity = input.nextLine();


        //if the city is in our tour, we can say: "We have a flight on Sunday".
        for (ArrayList<String> cityList : countries.values()) {

            if (cityList.contains(userWishCity)) {
                System.out.println("We have a flight on Sunday to " + userWishCity);
            }

        }


    }
}
/*
se puede usar un arraylsit as a value
cada vez que adicione un arrayList, le esta adicionando uno nuevo, en lista
//print-->directamente
first loop give me all the keys as a set
second loop toma toda la informacion desde adentro y la filtra
e
SEGUNDA FORMA
countries.values() crea como si todos los arrayList fueran un gran container. y en el lado izquierdo loop through the arrayList


*/
