package day30_a_arrayList;
//el usa collections para swap y el fori es porque necesita los index.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.
    The given ArrayList will always have an even number of elements so each element will always have a single pair

    Ex:
    Input:
        {"Cat", "in", "the", "hat"}

        There is two pairs:
            "Cat" and "in"
            "the" and "hat"

    Output:
        {"in", "Cat", "hat", "the"}
 */
public class SwitchBadPairs {
    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
        //                                                         0      1      2      3  .......
        System.out.println(words);

        for (int i = 0; i < words.size(); i += 2) {
            Collections.swap(words, i, i+1);
        }

        System.out.println(words);

    }

}