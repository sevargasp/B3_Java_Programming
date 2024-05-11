package day22_arrays;
/*
        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array
 */
public class MaxMin  {
    public static void main(String[] args) {


   int[] nums= { 500, 120, -80, 90, 250,-10};

   int max= Integer.MIN_VALUE;//this is the min value that it can hold.
   int min=Integer.MAX_VALUE;//this is max value that it can hold.

    for ( int eachNumb : nums){

        if(max<eachNumb){max=eachNumb;
        }// I also can use else if.
        if (min>eachNumb){min=eachNumb;

        }


    }
        System.out.println("min = " + min);
        System.out.println("max = " + max);




}
}
