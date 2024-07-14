package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str= "new example";
        System.out.println(str.isEmpty(  ));// It has characters.

        str= " ";
        System.out.println(str.isEmpty());//it still has an empty character. so ---> false

        str="";
        System.out.println(str.isEmpty());//now it is completely empty---> No single character

        System.out.println(str.length());

        if(str.length()==0){
            System.out.println("No characters");}

        //str= "";
        str="Hello World";
        System.out.println(str.isBlank());

        str=" ";//ONLY EMPTY SPACE
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());


        str= "       ";
        System.out.println(str.isBlank());



    }
}
