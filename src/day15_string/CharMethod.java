package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String str= "loop";
        //           0123
        //            (number of characters -1)
        //count char 4 characters
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        String str2= "loopcamp.!";//--->str2.length(); ----->10
        //            0123456789

        char first= str.charAt(0);//The charat(index); method returns us a SINGLE CHARACTER

        String str3="Hello World!";//length is 12
        //           01234567891011-- index is 11.

        //System.out.println(str.charAt(4));// it gives StringIndexOutOfBoundsException error

        //can you give last character of the String.
        String longWord="asfon asdfoin['wmneoiin'afn a[foin";
        System.out.println(longWord.length());
        System.out.println(longWord.charAt(longWord.length()-1));//System.out.println(longWord.charAt(33));
        System.out.println(longWord.charAt(longWord.length()-2));

        //the last index
        System.out.println("Num of Character: "+ longWord.length());
        System.out.println("last index of String: "+ (longWord.length()-1));
        System.out.println("last char: "+longWord.charAt(longWord.length()-1));

        /*

        loop
        Tom
        Jerry
        Tomo
        FOmo
        * */




    }
}
