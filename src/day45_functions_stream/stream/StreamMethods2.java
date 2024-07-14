package day45_functions_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {


        // #7 - map()
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // list4.stream().map()
        // Here .map() works with Function - functional interface which accepts ONE Object and returns ONE Object

        //Lets say I want take each element from arrayList, multi[ly it by 2 and reassign the result back to that List
        System.out.println("Before: " + list4);
        list4 = list4.stream().map((e)-> e * 2).collect(Collectors.toList());
        System.out.println("After: " + list4);

        System.out.println();

        List <String> list5 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
//        List <String> abbr = list5.stream().map( day -> day.substring(0, 3).toUpperCase()).collect(Collectors.toList());
        System.out.println("intento sergio");
        List <String> abbr = list5.stream().map( day -> day.substring(0, day.length()-3).toUpperCase()).collect(Collectors.toList());//llamar a map ayuda a poder usar lambda expresion.//este no es el mismo map que aprendimos, este es solo un metodo.
        System.out.println("Original: " + list5);
        System.out.println("Abbr: " + abbr);



        System.out.println();
        //--------------------------------------------------------------
        // #8 - filter()
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8));
        // Here .filter() works with Predicate - functional interface which accepts ONE Object and returns boolean

        // I want to get all even numbers and store into int List
        List <Integer> even = list6.stream().filter(eachNum -> eachNum % 2 == 0).collect(Collectors.toList());
        List <Integer> odd = list6.stream().filter(eachNum -> eachNum % 2 == 1).collect(Collectors.toList());
        System.out.println("Original: " + list6);
        System.out.println("Even  : " + even);
        System.out.println("Odd: " + odd);


        // This is what in the background happens
        Predicate <Integer> e = n -> {
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        List <Integer> even2 = new ArrayList<>();
        for (Integer each : list6) {
            if (e.test(each)) {
                even2.add(each);
            }
        }
        System.out.println(even2);

        // How mane even number we have
        System.out.println(list6.stream().filter(each -> each % 2 == 0).count());

        // count to even numbers without duplicates
        System.out.println(list6.stream().filter(each -> each % 2 == 0).distinct().collect(Collectors.toList()));
        System.out.println(list6.stream().filter(each -> each % 2 == 0).distinct().count());


        System.out.println();
        //--------------------------------------------------------------
        // #8 - forEach()
        List<Integer> list7 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8));
        //list4.stream().forEach();
        // Here .forEach() works with Consumer - functional interface which accepts ONE Object and does NOT return
        list7.stream().filter(p -> p % 2 == 0).forEach(each -> System.out.println(each));
        System.out.println();
        list7.stream().filter(p -> p % 2 == 0).forEach( System.out::println); // It is shortcut for print statement that work with Consumer (no return)


    }

}