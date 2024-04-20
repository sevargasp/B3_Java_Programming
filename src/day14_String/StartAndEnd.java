package day14_String;

public class StartAndEnd {
    public static void main(String[] args) {
        String str="Loopcamp";
        System.out.println(str.startsWith("Loop"));
        System.out.println(str.startsWith("loop"));

        System.out.println(str.startsWith("Loopcamp"));
        System.out.println(str.startsWith("Loopcamp!"));

        String str2="Loop";
        System.out.println(str.startsWith(str2));//does the str start with str2 which is Loop
        System.out.println(str.startsWith(" Loop"));
        System.out.println(str.startsWith(   "Loop"));//space between double quote

        String sentence= "today it was a Java day";
        System.out.println(sentence.startsWith("today it was"));

        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));//it requires match exactly.

        System.out.println(sentence.startsWith("today it was a Java day"));
        System.out.println(sentence.endsWith("today it was a Java day"));

        System.out.println(sentence.endsWith("y"));

        str.startsWith("Loop");
        str.endsWith("camp");


    }
}
