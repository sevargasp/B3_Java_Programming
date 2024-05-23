package day24_methods;

public class Email {
    public static void main(String[] args) {


        buildEmail("Micky Mouse", "Gmail.com");
        buildEmail("TOM JERRY", "yahoo.com");


    }


    // Create a method that is called buildEmail and that accepts two String parameters
    // take the full and then take FIRST character of first name and full last name concatenet with domain
    // "Micky Mouse", "gmail --- >  mmouse@gmail.com
    public static void buildEmail (String fulName, String domain) { // Non-parameterized method.

        String email = fulName.toLowerCase().charAt(0)
                +    fulName.toLowerCase().substring(fulName.indexOf(" ") + 1)
                +    "@"
                +    domain.toLowerCase(); // m + mouse

        System.out.println(email);

    }
}
