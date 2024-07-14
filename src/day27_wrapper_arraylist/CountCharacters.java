package day27_wrapper_arraylist;
/*
    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU
 */
public class CountCharacters {
    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";

        int upper = 0;
        int lower = 0;
        int digits = 0;
        int others = 0;


        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (Character.isUpperCase(each)) {
                upper++;
            } else if (Character.isLowerCase(each)) {
                lower++;
            } else if (Character.isDigit(each)) {
                digits++;
            } else {
                others++;
            }

        }

        System.out.println("Uppercase letters count: " + upper);
        System.out.println("Lowercase letters count: " + lower);
        System.out.println("Digit letters count: " + digits);
        System.out.println("Other letters count: " + others);


        System.out.println(Integer.MAX_VALUE); // These are not method. These arr CONSTANTS which we will learn later.
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);





    }

}