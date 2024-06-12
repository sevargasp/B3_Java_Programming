package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {


        // addAll()
        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO", "DevOps", "QA", "QE", "BA", "Dr", "PO"));
        System.out.println("Original: " + allJobs );


        // removeAll()
        ArrayList <String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList( "QA", "PO", "QE", "BA" )  );
        System.out.println("After 1st Remove: " + jobs1);


        // retainAll();
        ArrayList <String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll( Arrays.asList( "SDET", "Developer", "DevOps") );
        System.out.println("After Retain: " + jobs2);



        // containsAll();
        ArrayList <String> jobs3 = new ArrayList<>(allJobs);
        System.out.println( jobs3.containsAll(Arrays.asList("DevOps", "Dr")) );
        System.out.println( jobs3.containsAll(Arrays.asList("Police", "Dr", "Developer")) );


    }
}
/*
removeall(debe ser collection type, single object or several).si yo tengo dos coincidencias las remueve ambas.
this work for collection data type

es diferente de lo que se vio en la clase 28.





 */