package day42_b_maps.classroom;


/*
    KEY - Value

     1 - Student
     2 - Student
     3 - Student
     ...
 */

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {

        Map<Integer, Student> map = new HashMap<>();

        Student s1 = new Student("Tom", 30.0, 10);
        map.put(1, s1);


        map.put(2, new Student("Jack", 27.0, 7));//esta pasando objetos de tipo estudiante
        map.put(3, new Student("Mickey", 20, 8));
        map.put(4, new Student("Mouse", 18.0, 5));

        System.out.println(map);

        System.out.println();
        //Q: Get me the student which is assigned to the KEY 3
        System.out.println(map.get(3));


        System.out.println();
        //Q: get me the Student name which is assigned to the KEY 4
        System.out.println(map.get(4).name);


        System.out.println();
        //Q: How can I get all the KEYs only.
        //A: .keySet();
        System.out.println(map.keySet());//usa en otra clase para tener los no repetidos.


        System.out.println();
        //Q: How can I get all the VALUES only
        //A: values();
        System.out.println(map.values());//esto me da todos los valores.


        System.out.println();
        // another way to loop and get each
        for (Integer each : map.keySet() ){
            System.out.println("Row number: " + each);
            System.out.println( map.get(each));//me da cada key
            System.out.println();
        }


        System.out.println("-----------");
        // another way to loop and get each value only
        for ( Student each : map.values()){
            System.out.println(each);
        }

        System.out.println("-----------");
        // Q: get me the student only whose ega is less 25
        for ( Student each : map.values()){
            if(each.age < 25) {
                System.out.println(each);
            }
        }


        // another way to loop through using the .entrySet() method
        System.out.println("-----------");
        for ( Map.Entry<Integer, Student> each : map.entrySet()){
            System.out.println("Row: " + each.getKey());
            System.out.println("Value: " + each.getValue());
        }


    }
}