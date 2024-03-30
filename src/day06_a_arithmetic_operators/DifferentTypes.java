package day06_a_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[]args){
        //both int
        System.out.println(10-5);
        System.out.println(10*5);
        //double & double --->double
        System.out.println(10.0/2.0);

        //double & int---->double
        System.out.println(10.0/5);

        // int & double--->double

        System.out.println(10/ 5.0);

        System.out.println(10.0 / 5.0);//double&double

        System.out.println((int)10.0 / 5.0);//this means result is double because is bigger than int

        System.out.println((int)10 / (int)5.0);
    }
}
