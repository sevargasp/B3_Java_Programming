package day35_inheritance.book;

public class AudioBook extends Book {

    double duration; // 30min
    String narrator;

//HERE I HAVE ADDED A VARIABLE FROM THE PARENT AND ONE FROM THE CHILD
    public void listen (){
        System.out.println("Listening to " + title + " narrated by" + narrator );
    }

}