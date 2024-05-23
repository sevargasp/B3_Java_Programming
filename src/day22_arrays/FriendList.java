package day22_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*

    Make an array of your friends names

    asking how many friends do you have

    then ask for each friend's name one at a time, store all the names into an array

    at the end print your friend list
 */
public class FriendList     {
    public static void main(String[] args) {
Scanner key=new Scanner (System.in);
        System.out.println("How many friends do you want to save: ");
        int numOfFriendsSize = key.nextInt();//you can use directly in the size without variable// 5
        String [] friendList=new String [numOfFriendsSize];
key.nextLine();//to handle the next key.nextLine();
        for (int i = 0; i < friendList.length; i++) {
            System.out.println("Enter friend name who you want to save to");
            String eachInfo= key.nextLine().toLowerCase();
//todo esto fue para poder imprimir el letra mayuscula
            friendList[ i ]= eachInfo.substring(0,1).toUpperCase()+eachInfo.substring(1);

        }
        System.out.println("I have "+friendList.length+" to save");
//        String friendListString=Arrays.toString(friendList);

//        System.out.println(friendListString.substring(1,friendListString.length()-1));//this is one way to print out I have 3 to save
//        ana, pepe, jose
        for (String eachName : friendList) {
            System.out.println("\t"+eachName);

        }

        }

    }

