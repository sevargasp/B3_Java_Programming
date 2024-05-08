package day17_loops;

import java.util.Scanner;
/* repeated action
* -ask user to enter the item
* -add item to the shopping list
* ask user if they want to add more items.
*
* at the end show the whole item list
* */
public class Shopping_list {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        String list= "Shopping List: ";
String userAnswer;
        do{
            System.out.println("Please, enter the name of the item: ");
            String userItem = key.nextLine();
            list=list+"\n\t"+userItem;
            System.out.println("Do you want to add more item? ");
            userAnswer= key.nextLine();
        }while(userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));//anytime that I write different this to Yes or y, it goes to stop.
        // the loop will continue the ITERATION/ cycling as long as user enters "yes" or the different options.
        System.out.println(list);


    }
}
