package day45_functions_stream.functions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {
        Consumer <Integer> printN = n -> { // 7 -- > 1, 2, 3, 4, 5, 6, 7
            for (int i = 1; i <= n ; i++) {
                System.out.print(i + " ");//tod@ lo anterior es la implementacion de la funcion.
            }
        };

        // Since I am in the SAME CLASS as my implementation and calling that function from same the class, I do not need to use the Interface name
        printN.accept(7); // accept(T t); is the abstract method defined in Consumer functional interface
//i call using my implementation name and my method.
        System.out.println("------------------------------");

        List <String> list = new ArrayList<>(Arrays.asList("Hello", "Java", "Summer", "Winter", "Pool"));
        list.forEach( e -> System.out.println(e)); //Consumer<? super T> action =  e -> System.out.println(e);
//este viene desde iterable, la e --> es la expresion lambda, este consumer no retorna nada, BASICAMENTE LO QUE DICE ESTE FOR EACH ES QUE CADA VEZ QUE SE ESTA HACIENDO EL LOOP SE ASIGNA CADA ELEMENTO A LA E, Y POSTERIORMENTE LO IMPRIME.

        // list.forEach --- > loops through all your collection and get each element one by one
        // e -> System.out.println(e) -- > is Consumer <T>
        // e - once getting each element, it assigns it into "e"
        // System.out.println(e) - Lambda expression body / implementation ---  which is just print statement


        list.forEach(e -> {
            System.out.println(e.charAt(0) + " " + e.charAt(e.length()-1));
        });

        list.forEach(e -> {
            if (e.length() > 4){
                System.out.println(e);
            }
        });
    }
}