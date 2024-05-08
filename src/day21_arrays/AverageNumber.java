package day21_arrays;
/*
    Average Number from Array
    Given an int array calculate the average number ->Challenge: Make it flexible so it will work with any array size
    Examples:
    [1,2,3] -> average: 2
    [10, 15, 5, 6] -> average: 9
    [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
 */
public class AverageNumber
{
    public static void main(String[] args) {
int [] nums = {10, 15, 5,6 };
int result=0;
        for (int i = 0; i < nums.length; i++) {
          result+=nums[i];

        }
int average=result/ nums.length;
        System.out.println(average);


        //by for, i can do it, because i am not changing the value, i am just reassigning in another variable.
        int sum=0;
        for( int each : nums   ){
            sum+=each;


        }
        System.out.println(sum/ nums.length );
    }
}
