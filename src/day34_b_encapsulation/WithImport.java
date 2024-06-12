package day34_b_encapsulation;

// Import all static thing in util package specifically Arrays class
// If you do static import, all the non-static things are not accessible

import my_utilities.ArrayUtil;

import java.util.Arrays;

import static my_utilities.StringUtil.*;
import static my_utilities.ArrayUtil.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class WithImport {
    public static void main(String[] args) {

        int [] a = {81, 23, 65, 33};
        //Arrays.sort(a);
        sort(a);

        //System.out.println(Math.PI);
        System.out.println(PI);


        //System.out.println(StringUtil.reverse("java"));
        System.out.println(reverse("java"));

        minNumInArr(a);

        // System.out.println(toString(a)); // Since this is a special method. Sometimes it is instance method, that is why Java here does nto know if it is static version




    }
}
//static import permite llamar to do lo relacionado con static. con esto ya no necesitaria llamar a la clase. lo puedo hacer directamente.

//este no me dejaria usar metodos instanciados, una vez que importo lo estatico, todos los metodos deben seguir siendo estaticos.