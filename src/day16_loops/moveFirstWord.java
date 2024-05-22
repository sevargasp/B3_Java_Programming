package day16_loops;

import java.util.Scanner;

public class moveFirstWord {
    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
        System.out.println("Please, enter a sentence: ");
        String sentence=key.nextLine();//Java is a fun language
        sentence=sentence.trim();//you can reassign
        //take the part from sentence
//        int indexOfFirstSpace=sentence.indexOf(" ");
//        String firstWord=sentence.substring(0, indexOfFirstSpace);esta es otra manera

        String firstWord=sentence.substring(0,sentence.indexOf(" "));
        String restOfSentence=sentence.substring(sentence.indexOf(" ")+1)    ;//i can use the same, but just changing instead of" " --->.trim.

        System.out.println(firstWord);
        System.out.println(restOfSentence);




    }
}
