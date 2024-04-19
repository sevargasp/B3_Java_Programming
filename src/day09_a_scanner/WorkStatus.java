package day09_a_scanner;

import java.util.Scanner;

/*
    Task

    create Scanner object
    ask the user to enter their first name - next
    ask the user to enter their last name - next
    ask the user if they are employed - boolean
    ask the user if they are a student - boolean

 */
public class WorkStatus {
    public static void main(String[] args) {
        Scanner information= new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName= information.next();

        System.out.println("your name is: "+ firstName);


        System.out.println("Enter your last name: " );
        String lastName = information.next();

        System.out.println("your second name is: "+ lastName);

        System.out.println("your full name is: "+firstName+" "+lastName);

        System.out.println("Are you employed: [true / false]");
        boolean areUEmployed =information.nextBoolean();

        System.out.println("Are you student [true / false]");
        boolean areUStudent= information.nextBoolean();

        String personInfo= firstName+" "+lastName+" is employed "+areUEmployed+" and the person is a student: "+areUStudent;

        System.out.println(personInfo);

    }

}
