package day21_arrays;
/*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
    Input: [4,1,3,12,5]
    Output:
    Even: 2
    Odd: 3
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        String even="";
        String odd="";
        int countEven=0;
        int countOdd=0;
        int[] nums = {4, 1, 3, 12, 5, 20, 13};
        for (int eachNum : nums) {
            if (eachNum % 2 == 0) {
//                System.out.println("even" + eachNum);
                even+=" "+eachNum;
                countEven++;
            } else {
//                System.out.println("odd" + eachNum);
                odd+=" "+eachNum;
                countOdd++;
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
        System.out.println("count even numbers = " + countEven);
        System.out.println("count odd numbers = " + countOdd);

    }}