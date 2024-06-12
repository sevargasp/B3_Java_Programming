package day17_loops;

public class Factorial {
    public static void main(String[] args) {
        int n= 5;
        int numberoriginal=n;
        int result=1;
        //!5 5*4*3*2*1 //repeated action:multiply the numbers by one less than itself
        //!4 --4*3*2*1
        // stopping point: when number get to be 1.

        while(n>1){n--;
        result=result*n;
        n--;}
        System.out.println("Factorial of "+numberoriginal+" is "+ result);

    }
}
