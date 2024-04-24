package day15_string;

import java.util.Scanner;

/*
    NOTE> FIND THE BIGGEST ONE AND CHECK IF THE BIGGEST HAS "A" IN IT.
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
public class LongestWithA {
    public static void main(String[] args) {
        Scanner key= new Scanner(System.in);
        System.out.println("Enter 3 words: ");

        String word1= key.next().toLowerCase();
        String word2= key.next().toLowerCase();
        String word3= key.next().toLowerCase();

        int wordOneLength= word1.length();//we assign in variables because is easier.
        int wordSecondLength=word2.length();
        int wordThirdLength=word3.length();

        if(wordOneLength> wordSecondLength & wordOneLength >wordThirdLength & (word1.contains("a"))){   System.out.println(word1+" is biggest and has the \"a\"");
        } else if(wordSecondLength> wordOneLength & wordSecondLength > wordThirdLength & word2.contains("a")){System.out.println(word2+" is biggest");
        } else if(wordThirdLength>wordOneLength & wordThirdLength> wordSecondLength & word3.contains("a")){ System.out.println(word3+" is biggest");} else {
            System.out.println("There is no single biggest word");//todo: check, im not sure.
    }
        }

}
