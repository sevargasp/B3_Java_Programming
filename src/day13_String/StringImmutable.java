package day13_String;

public class StringImmutable {
    public static void main(String[] args) {
        String str1 = "loop";//you can not change it.
       str1 +="camp";//loopcamp
        System.out.println(str1 +="camp");

    }
}
