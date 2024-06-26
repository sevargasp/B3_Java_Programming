package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Micky");
        names.add("Mouse");
        System.out.println(names);


        // To be able to use Iterator, I need to first declarer Iterator
        Iterator <String> it  = names.iterator();//la mayoria del tiempo se llaman iterator o it(iterador)
                                        //ESTE ES EL METODO QUE SE VA A USAR DEL ITERADOR.
        System.out.println(it.next()); // move the cursor/pin, and return the element
        System.out.println(it.next()); // move the cursor/pin, and return the element
        System.out.println(it.next()); // move the cursor/pin, and return the element
        System.out.println(it.next()); // move the cursor/pin, and return the element
        //System.out.println(it.next()); // NoSuchElementException - move the cursor/pin, and return the element - there is no element anymore, so exception happened




    }
}