package day09_a_scanner;

import java.util.Scanner;

public class UseNext {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is today: ");
        String day=input.nextLine();

        System.out.println("Enter your first name: ");

        String firstName= input.next();

        System.out.println("Enter your last name: ");
        String lastName= input.next();


        input.nextLine() ;//to handle the next nextLine issue, we have to write former the input.line.MANDATORY
        System.out.println("Enter your address: ");
        String address=input.nextLine();//it doesnt catch

        System.out.println("Enter job title: ");// we did not need to handle it because  it is required for any OTHER scanner methods it they before nextline.
        //we need always to avoid the issue a nextline code before otherwise it is not going to work.
        String jobTitle= input.nextLine();


        System.out.println("Today: " + day);
        System.out.println("First Name: "+firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("address = " + address);
        System.out.println("jobTitle = " + jobTitle);


    }
}
