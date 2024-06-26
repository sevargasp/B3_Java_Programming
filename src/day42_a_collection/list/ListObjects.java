
package day42_a_collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {

        List<String> list  = new ArrayList <>(); // reference of the interface List, but the object is ArrayList
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");//puedo anadir estos add porque hacen parte del metodo grande add que provienen de LIST(Interface)
        list.add(null); // null is allowed
        list.add("a");  // can add duplicated
        System.out.println(list); // Insertion order is kept
        System.out.println(list.get(3));


        System.out.println();

        List<String> list2  = new LinkedList<>(); // reference of the interface List, but the object is LinkedList
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null); // null is allowed
        list2.add("a");  // can add duplicated
        System.out.println(list2); // Insertion order is kept
        System.out.println(list2.get(3));

        System.out.println();

        List<String> list3  = new Vector<>(); // reference of the interface List, but the object is Vector
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null); // null is allowed
        list3.add("a");  // can add duplicated
        System.out.println(list3); // Insertion order is kept
        System.out.println(list2.get(3));




    }
}