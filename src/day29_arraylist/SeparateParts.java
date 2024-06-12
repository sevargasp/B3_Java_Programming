package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {

        String str = "ABCD123$%#@456EFG!"; //
        ArrayList <String> list = new ArrayList<>(  Arrays.asList( str.split("") ) );
        //list.addAll(  Arrays.asList( str.split("") ));
        System.out.println(list);


        ArrayList <String> numbers = new ArrayList<>(list);
        numbers.retainAll( Arrays.asList( "0", "1", "2", "3", "4", "5", "6", "7", "8", "9") );
        System.out.println(numbers);


        ArrayList <String> special = new ArrayList<>(list);
        special.retainAll( Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(",  ")", "-"));
        System.out.println(special);


        ArrayList <String> letters = new ArrayList<>(list);
        letters.removeAll(numbers);
        letters.removeAll(special);
        System.out.println(letters);

    }
}
/*
con una linea inicial lo split, lo puso collection type y lo asigno a arraylist de tipo string



 */
