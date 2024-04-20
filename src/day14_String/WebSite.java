package day14_String;

import java.util.Scanner;

/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
        .io

      in cases it is not valid, tell the reason why

 */
public class WebSite {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please, enter a website: ");
        String website=input.next().toLowerCase();

        //website.startsWith("www.");

        //website.endsWith(".com" || ".edu" || ".gov" || ".net");

        boolean isValidStart = website.startsWith("www.");
        System.out.println(isValidStart);

//        if (website.endsWith("www.")){
//            System.out.println("true");
        boolean isValidEnd= website.endsWith(".com")||
                website.endsWith(".edu" )|| website.endsWith(".gov")|| website.endsWith(".net")|| website.endsWith(".io");

        if (isValidEnd && isValidStart) {
            System.out.println("It is a valid website");
        } else{
            System.out.println("It is a invalid website");
            if(!isValidEnd){
                System.out.println("you have to fix valid end");}
            if(!isValidStart) { System.out.println("you have to fix the beginning");}

        }



    }}
