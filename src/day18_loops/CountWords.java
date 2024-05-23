package day18_loops;

import java.util.Scanner;

/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
        Input:
            This has multiple words
        Output:
            4
 */
public class CountWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int countSpace=0;
        System.out.println("Please, enter a sentence");
        String sentence=input.nextLine().trim();//trim, because I dont want spaces at the beginning or ending.

//java is a cool language
        //count number of spaces
        //+1 would be the words
        //how can i count how many spaces I have?
        //go through each character and check if it is equal to space - if it is increase count
        for (int i = 0; i < sentence.length(); i++) {

            if(sentence.charAt(i)==' '){countSpace++;
            //System.out.println(sentence.charAt(i));//this print each character
        }
    }
        System.out.println("There are total "+(countSpace+1)+" words");
}}
