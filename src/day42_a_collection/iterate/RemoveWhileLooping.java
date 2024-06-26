package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {

        ArrayList <Integer> list  = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 6, 2, 5, 6, 2, 3, 1, 4, 5));

        // traditional loop with removing, will cause issue because indexes get shifted to left. So, it will skip some elements
        //for (int i = 0; i < list.size(); i++) {
        //    if (list.get(i) < 5){
        //        list.remove(i);//esto se saltaria datos cada vez que se remueva uno.
        //    }
        //}
        //System.out.println(list);

        //i = 0:   2, 3, 5, 6, 12, 6, 2, 5, 6, 2, 3, 1, 4, 5
        //i = 1:   3, 5, 6, 12, 6, 2, 5, 6, 2, 3, 1, 4, 5
        //.....


        // With foreach loop it will ConcurrentModificationException because we cannot change the size of the collection when looping through
        //for ( Integer each : list ) {
        //        if (each < 5){
        //            list.remove(each); // ConcurrentModificationException
        //        }
        //}
        //System.out.println(list);
        //each = 2:   2, 3, 5, 6, 12, 6, 2, 5, 6, 2, 3, 1, 4, 5
        //each = 3:   3, 5, 6, 12, 6, 2, 5, 6, 2, 3, 1, 4, 5 ------- // ConcurrentModificationException
        //.....


        System.out.println(list);
        Iterator <Integer> it = list.iterator();//se lama al metodo iterador, el cual retorna un nuevo objeto ITR

        while (it.hasNext()) { // checks if there is an element next to it - if yes, it returns TRUE, if not, returns false

            if (it.next() < 5){ // move to the next element and the return it
                it.remove(); // removing the element from list, if my "if" condition is TRUE
            }

        }
        System.out.println(list);


    }
}