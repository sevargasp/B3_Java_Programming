package day22_arrays;

import java.util.Arrays;

public class SortOfExample {
    public static void main(String[] args) {
        String[] arr = {" java", "Hello", "$Dollar", "Zelle", "softskills","4four", "6Six", "Hi", "SIX" };

        //Special chars > numbers > uppercase (A-Z) > lowercase (a-z)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
