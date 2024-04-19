package day08_scanner_logical_operator;

public class ourPractice {
    public static void main(String[]args){

        int apples = 5;
        int oranges = 10;

        System.out.println(apples > 1 || oranges < 5);  // since this is || and FIRST part is true, I actually do not need to check the 2nd side.
        // Because, only false || false can give FALSE
        //                  true || false
        //                  true
        System.out.println(apples > 10 || oranges == 10);
        //                  false || true
        //                  true
        System.out.println(apples > 10 && oranges == 10);   // since this is && and FIRST part is false, I actually do not need to check the 2nd side.
        // Because, only true && true can give TRUE
        //                  false && true
        //                  false
    }
}
