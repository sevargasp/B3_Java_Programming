package day14_String;

public class RemoteSpace {
    public static void main(String[] args) {
        String str ="    Thursday    ";
        System.out.println(str);
        System.out.println(str.length());//16 characters

        str=str.trim();
        System.out.println(str.length());//trim method, remove the spaces at the beginning and the end.

        String str2= "    java is fun    ";
        System.out.println(str2.trim());
        System.out.println(str2.trim().length());

        String str3="   loopcamp has SDET program";
        System.out.println(str3.length());

        System.out.println(str3.trim());
        System.out.println(str3.length());//it is still the former value because we havent assigned it.

        str3=str3.trim();
        System.out.println(str3.length());

    }
}
