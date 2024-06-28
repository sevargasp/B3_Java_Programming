package day44_map_and_functions.string_builder_buffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {

        //1.    String Class
        //      Strings are IMMUTABLE - we cannot change
        String str1 = "loocpamp";                       // Stored in String Pool in Heap
        String str2 = new String("loocpamp");   // Stored directly in Heap
        str1 = str1 + str2;                             // IMMUTABLE - we cannot change it - here we created a new String



        //2.    StringBuilder Class
        //      It is in java.lang package
        //      **MUTABLE** - once object is created, we still can change the SAME object
        //      It is NOT synchronized
        //      It can only be created using "new" keyword

        System.out.println();
        StringBuilder str3 = new StringBuilder("loopcamp"); // Stored directly in Heap
        System.out.println(str3);
        str3.append(" course");
        System.out.println(str3);


        System.out.println();
        //3.    StringBuffer Class
        //      It is in java.lang package
        //      **MUTABLE** - once object is created, we still can change the SAME object
        //      It IS synchronized
        //      It can only be created using "new" keyword
        StringBuffer str4 = new StringBuffer("loocpamp");
        System.out.println(str4);
        str4.reverse();
        System.out.println(str4);


    }
}
