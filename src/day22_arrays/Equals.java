package day22_arrays;

import java.util.Arrays;

public class Equals { public static void main(String[] args) {

    int [] a = {1, 2, 3, 4};
    int [] b = {1, 2, 3, 4};
    int [] c = a;


    System.out.println(a == b); // DO NOT USE == to compare arrays
    // This compare two different array objects
    System.out.println(Arrays.equals(a, b));

    System.out.println(a == c); // DO NOT USE == to compare arrays
    // IN this case, it will be true becuse a and c, both points to the same array object


    boolean result = Arrays.equals(b, c);  //true
    System.out.println(result);


    int [] d = {4, 3, 2, 1};
    System.out.println(Arrays.equals(a, d));
    Arrays.sort(d); // [1, 2, 3, 4]
    System.out.println(Arrays.equals(a, d));


}
}
