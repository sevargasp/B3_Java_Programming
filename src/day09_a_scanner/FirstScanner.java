package day09_a_scanner;
//first of all, get the import class
import java.util.Scanner;

public class FirstScanner {public static void main(String[]args){
    //#1 Scanner object declaration/ or instantiatied--> connect console to our computer
    //Scanner input; -->input is the object reference name

    Scanner input= new Scanner(System.in);//

    //#2 we get  the value for console
    System.out.println("Please, enter a number: ");
    int userNumber
            /*after run, i go back and assign as a variable*/
            = input.nextInt();// input is the key to go throw the house, and the nextint means the house.
    System.out.println("You entered: "+ userNumber);// with this step after customer writes something im gonna print it.



}
}
