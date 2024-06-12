package day26_methods;
import my_utilities.ArrayUtil;
public class UsingArrayUtil {
    public static void main(String[] args) {

        int [] a ={3,1,5,7,3,23};

        System.out.println(ArrayUtil.minNumInArr(a));//min num method. this can be printed or storage into the container.

        System.out.println(ArrayUtil.maxNumInArr(a));//max num method

        System.out.println(ArrayUtil.contains(a,4));

        System.out.println(ArrayUtil.contains(a, 3));

    }
}
