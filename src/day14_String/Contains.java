package day14_String;

public class Contains {
    public static void main(String[] args) {

        String weather= "Today it was above 70";
        System.out.println( weather.contains("it was"));
        System.out.println(weather.contains("s"));
        System.out.println(weather.contains("today"));//uppercase, this is not an exact matching.
        System.out.println(weather.contains("Today") || weather.contains("70"));
        System.out.println(weather.contains("Today && 70")  );//this is false, double quote

    }
}
