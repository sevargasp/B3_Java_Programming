package day35_inheritance.book;

public class EBook extends Book {

    double size; // 5mgb
    int pages;


    public void read () {
        System.out.println("Reading a digital copy of " + title);
    }

}