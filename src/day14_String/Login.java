package day14_String;

import java.sql.SQLOutput;
import java.util.*;

/*

    Ask the user to enter a username
    make sure the username is in lowercase
    check if the username is matching

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp!"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */
public class Login {
    public static void main(String[] args) {

        Scanner key= new Scanner (System.in)    ;
        System.out.println("Enter your username");
         String username= key.next();//i can do lowercase directly just after keynext.to....
         username=username.toLowerCase();
        System.out.println("Enter your password");
        String password= key.next();
        String validPassword="loopcamp!";
        String expectedUserName= "java";

        if(expectedUserName.equals(username) &&  password.length()>8 && password.equals(validPassword) ){
            System.out.println("Valid password.. logged  in ");}else  {
            System.out.println("Invalid Username or Password");
    }
}}
