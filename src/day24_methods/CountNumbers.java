package day24_methods;

/*

    count up to a certain number
    start from 0
    all the numbers until the number input

    method(5) --> 0 1 2 3 4 5

    method(10) --> 0 1 2 3 ... 10

 */
public class CountNumbers {

    public static void count (int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        count(5);
        count(10);
    }
}
