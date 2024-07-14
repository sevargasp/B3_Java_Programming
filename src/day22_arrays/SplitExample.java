package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str=  "monday tuesday wednesday thursday friday saturday sunday";
        String []days  = str.split(" ");//coma separes every Single string.
        System.out.println(Arrays.toString(days));

        for( String each: days) {
            System.out.println(each);
        }

        System.out.println("-------------------");
        String []withOutDay = str.split("day");//[]
        System.out.println(Arrays.toString(withOutDay));


        System.out.println("=============");
        String str3 = "Jan-Feb-Mar_Apr-May-Jun-Jul-Aug-Sep_Oct_Nov_Dec";
        String [] arr1 = str3.split("-");

        for (String each : arr1) {
            System.out.println(each);
        }


        System.out.println();
        String str4 = "Hello world!";
        String [] all = str4.split("");
        for( String each : all) {
            System.out.println(each);
        }

        System.out.println("---ANOTHER EXERCISE"  );
        String str5="It is a break time";
        String breakTime[]=str5.split("-");//imprime 1 sola vez, porque no hay dash
        for (String eachOne : breakTime){
            System.out.println(eachOne);






    }
}}
