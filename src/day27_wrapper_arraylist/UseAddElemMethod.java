package day27_wrapper_arraylist;
import my_utilities.ArrayUtil;

import java.util.Arrays;

public class UseAddElemMethod {
    public static void main(String[] args) {
int []a={1,2,3,4,7,8};
    int []b={23,345,2,0};

int [   ]   arr = ArrayUtil.addElemInArr(a,b);

//tengo que llamar a la otra funcion para poder imprimir
        System.out.println(Arrays.toString(ArrayUtil.addElemInArr(a, b)));

        System.out.println(ArrayUtil.maxNumInArr(arr));

        System.out.println(ArrayUtil.minNumInArr(ArrayUtil.addElemInArr(a, b)));

    }
}
