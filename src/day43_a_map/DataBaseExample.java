package day43_a_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {

        /*
            Database Table: People

                FIRST_MAME | LAST_NAME | BATCH NO  < ------- column names
                Andrew     | Lana      | 3         < ------- data rows
                Jeyhun     | Mammadov  | 3
                Laura      | Berkowitz | 3
                Anna       | Nicol     | 3
                James      | James     | 3
         */

        Map <String, String> student1 = new HashMap<>();
        student1.put("FIRST_NAME", "Andrew");
        student1.put("LAST_NAME", "Lana");
        student1.put("BATCH NO", "3");

        System.out.println(student1);

        Map <String, String> student2 = makeMap("Jeyhun", "Mammadov", "3");
        Map <String, String> student3 = makeMap("Laura", "Berkowitz", "3");

        List <Map <String, String>> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student2);
        listOfStudents.add(makeMap("James", "Bond", "2"));
        listOfStudents.add(makeMap("Tom", "Jerry", "2"));
        listOfStudents.add(makeMap("Vinnie", "Pooh", "1"));
        listOfStudents.add(makeMap("Micky", "Mouse", "1"));

        // Can you get me the last name of the second student / first name
        System.out.println( listOfStudents.get(1).get("LAST_NAME")); // Map at the index of 1  |  then get the value assign to LAST_NAME
        System.out.println( listOfStudents.get(1).get("FIRST_NAME"));


        System.out.println("--------------------------------");
        // can you get me the information of each student?
        for ( Map <String, String> each : listOfStudents ){
            System.out.println(each);
        }

        System.out.println("--------------------------------");
        //How can I get all the first names?
        for (Map <String, String> each : listOfStudents){
            System.out.println(each.get("FIRST_NAME"));
        }


        System.out.println("--------------------------------");
        // get me all the students whose batch number is more than 1
        for (Map <String, String> each : listOfStudents){

            if(Integer.parseInt(each.get("BATCH NO")) > 1) { // "2" -- > 2
                System.out.println(each);
            }

        }


        System.out.println("--------------------------------");
        //Get me the information of the last student
        System.out.println( listOfStudents.get(listOfStudents.size()-1));

        //GEt me the last name of last student?
        System.out.println(listOfStudents.get(listOfStudents.size()-1).get("LAST_NAME"));


    }


    // make a reusable method that accepts info about a student and adds it into a Map and returns it
    public static Map <String, String> makeMap (String firstName, String lastName, String batchNo) {
        Map <String, String> map = new HashMap<>();
        map.put("FIRST_NAME",  firstName);
        map.put("LAST_NAME",  lastName);
        map.put("BATCH NO",  batchNo);

        return map;
    }

}
/*

 */
