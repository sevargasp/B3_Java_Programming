package day15_string;

import java.util.Scanner;

/*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
 */
public class Filter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please, enter a message: ");
       String msg= input.nextLine().trim().toLowerCase(); //this is one way to do.// other way could be assigning later in the next lane.
        System.out.println("You entered: "+msg);

        boolean hasBadWords= msg.contains("java is bad")|| msg.contains("quite")|| msg.contains("have fun") || msg.contains("crying");

        if (hasBadWords){
            System.out.println("Message failed to sent");}else {
            System.out.println("\""+msg + "\" was sent!");

    }
}}
