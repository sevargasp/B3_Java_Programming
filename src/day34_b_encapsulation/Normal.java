package day34_b_encapsulation;

import my_utilities.StringUtil;
import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int [] a = {81, 23, 65, 33};
        Arrays.sort(a);
        //sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI);
        //System.out.println(PI);

        System.out.println(StringUtil.reverse("java"));
        //System.out.println(reverse("java"));
    }
}
//se prefiere este porque permite usar ambos metodos, estaticos e instanciados.