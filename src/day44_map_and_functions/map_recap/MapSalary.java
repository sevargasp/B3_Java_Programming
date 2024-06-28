package day44_map_and_functions.map_recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {

        Map <String, Double> map = new HashMap<>();
        map.put("Jeyhun", 110_000.00);
        map.put("Gedi", 120_000.00);
        map.put("Elina", 155_000.00);
        map.put("OlexandrS", 130_000.00);
        map.put("OlexandrM", 150_000.00);
        map.put("Andrew", 125_000.00);
        map.put("Laura", 135_000.00);
        map.put("Ayaz", 120_000.00);


        //Find the person name and the salary who is making the HIGHEST SALARY and LOWEST SALARY
        // MAX SALARY: $name - $$salary
        // MIN SALARY: $name - $$salary


        String namForHighestSalary = "";
        double maxSalary = 0.0;


        String namForLowestSalary = "";
        double minSalary = Double.MAX_VALUE; //1.7976931348623157E308


        //[100000.0, 120000.0, 135000.0, 125000.0, 105000.0, 130000.0, 110000.0, 140000.0]

        for (String eachName : map.keySet()){

            //System.out.println("Each Name: " + eachName);
            //System.out.println("Each related salary: " + map.get(eachName));
            //System.out.println();

            double salaryForEachName = map.get(eachName);

            if (salaryForEachName > maxSalary) {
                maxSalary = salaryForEachName;
                namForHighestSalary = eachName;
            }

            if (salaryForEachName < minSalary){
                minSalary = salaryForEachName;
                namForLowestSalary = eachName;
            }

        }

        System.out.println("MAX SALARY: " + namForHighestSalary + " - $" + maxSalary);
        System.out.println("MIN SALARY: " + namForLowestSalary + " - $" + minSalary);

        System.out.println("----------------------------");
        // Find for these data, how many people make salary between 130K and 160K (both inclusive)
        // $number of people makes salary between 130K and 160K
        int counter = 0;

        for (Double eachSalary : map.values()) {
            if ( eachSalary >= 130_000.00 && eachSalary <= 160_000){
                counter++;
            }
        }
        System.out.println(counter + " of people makes salary between 130K and 160K");


        System.out.println("----------------------------");
        // Find me the names who makes salary less than 130K
        // $name1, $name2 ... makes salary less than 130K

        List <String> allName = new ArrayList<>();
        for ( String eachName : map.keySet()) {
            if (map.get(eachName) < 130_000.00) {
                allName.add(eachName);
            }
        }
        System.out.println(allName.toString().replace("[", "").replace("]","") +
                " makes salary less than 130K" );

        System.out.println("----------------------------");
        // Increase the salary for every one by $10K in the data structure (map)
        System.out.println("Before Increase: " + map.values());
        for ( String eachName: map.keySet()) {
            map.put(eachName, map.get(eachName) + 10_000.00);
        }
        System.out.println("After Increase: " + map.values());


    }
}
//(variable que sea que corresponde al map al valor que requiero)
// String each name : map(nombre del mapa que le di).keySet()(este es el metodo para obtener las llaves)
//y hago el loop, despues le creo condiciones
//solo con los kkey puedo tener los valores, pero NO VICEVERSA