package day22_arrays;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String[] words= {"a", "b", "c"};
        System.out.println(Arrays.toString(words));


        System.out.println(String.join("<>", words));
        System.out.println(String.join("--------", words));
        System.out.println(String.join(" ", words));

        String fromArr = String.join("", words);
        System.out.println(fromArr);

        System.out.println(String.join("\"", words));

    }
}
