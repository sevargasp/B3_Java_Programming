package day45_functions_stream.functions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {
//la diferencia con los otros es que retorna o no y que tipo lo hace.
        // <T, R> --- > accepts one Object Type (T), and return one Object Type (R)
        Function <int [], List<Integer>> convertArrIntoList = (arr) -> {//esa comma significa que va a convertir en el otro data type, en este caso es una conversion desde array hasta list.
            List <Integer> list = new ArrayList<>();//tod@ esto es lamba expresion o implementation body.
            for ( int each : arr) {
                list.add(each);
            }
            return list;
        };


        int [] a = {34, 23, 62, 123, 64, 2, 123};
        System.out.println( convertArrIntoList.apply(a) );//ahora el datatype de esto es arrayList.

        // also remove duplicates
        System.out.println(new HashSet<>(convertArrIntoList.apply(a)));

        // also sort
        System.out.println( new TreeSet<>(convertArrIntoList.apply(a)));


    }
}