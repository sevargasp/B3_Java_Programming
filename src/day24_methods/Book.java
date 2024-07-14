package day24_methods;
import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("How many chapters are in book: ");
        //int num = key.nextInt();
        String [][] book = new String[key.nextInt()][]; // 2 -- >  String [][] book = new String[2][]
        //book[0] = new String[]{"h", "a"};
        //book[1] = new String[]{"k", "l"};
        //System.out.println(Arrays.deepToString(book));
        //System.out.println(book[0][0]); // NullPointerException


        key.nextLine();//This is to handle the possible issue
        for (int i = 0; i < book.length; i++) {

            System.out.println("Enter paragraph for each chapter: ");
            // book[i] = key.nextLine().split("! "); con esto ahorraria lineas de codigo
            String eachParagraph = key.nextLine();  //Hello people! Welcome to our new class! Today we will cover methods!
            // Bye people! See you later!


            // book[i] = eachParagraph.split("! ");esto se puede hacer para asignarlo directamente
            String [] eachSentence = eachParagraph.split("! ");      // ["Hello people", "Welcome to our new class", "Today we will cover methods!"]
            // ["Bye people", "See you later!"]

            book[i] = eachSentence;

        }

        System.out.println(Arrays.deepToString(book));






        //Hello people. Welcome to our new class. Today we will cover methods.
    }
}