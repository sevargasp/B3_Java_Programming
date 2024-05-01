package day18_loops;

import java.util.Scanner;

/*
    Palindrome: its the same reading from the beginning and end

    Ex:
        mom
        racecar
        anna
        madam

    Task: Check if a word is palindrome

    Flow:
        declare some initial String
        how to reverse a String
        check if the reverse version is the same as the original
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("enter a possible palindrome world");
       String str=key.next();
        String reversed="";
        // first I need to revers that word.
        // second I need to compare if they are equal
        //          if EQAUL - print it is palindrome
        //          else ----- print it is not palindrome


        // How can I reverse
        // start taking the characters from end
        // and add it into the new container one by one.


//        str.charAt(str.length() -1);
//        reversed += "" +str.charAt(str.length() -1);

        for (int i = str.length() -1; i >=0 ; i--) {//abcd ---> 3       |2  |1      |0      |-1
            reversed+=str.charAt(i);      }          //reversed---=""+d; |d+c|dc+b   |dcb+a
            if (str.equals(reversed)){
                System.out.println("PALINDROME");
            }else   {
                System.out.println("NOT PALINDROME");
            }
            //how can we write with ternary
        System.out.println(str.equalsIgnoreCase(reversed)?"PALINDROME": "NOT PALINDROME");
        }


}
