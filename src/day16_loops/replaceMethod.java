package day16_loops;

public class replaceMethod {
    public static void main(String[] args) {
        String s="java is a language";
        s=s.replace('a','e');
        System.out.println(s);

        String day="Today is Wednesday. We will do practice. It is Wednesday";
        day=day.replace("Wednesday", "Today");
        System.out.println(day );

        int firstDot=day.indexOf(".");
        int lastDot= day.lastIndexOf(".");
        System.out.println("---------");
        String middle= day.substring(firstDot+1,lastDot+1).trim();//i can use trim, because is the last value is a String
        System.out.println(middle);

        System.out.println("---------");
String word= "Loop";
word=word.replace("o","u");
        System.out.println(word);
    }
}
