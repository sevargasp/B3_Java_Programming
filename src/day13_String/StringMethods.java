package day13_String;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        String name="Micky";
        String name2="Micky";
        String name3= new String("Micky");
        // == this operator compares the memory location.
        System.out.println(name==name2);
        System.out.println(name== name3);
        System.out.println(name2==name3);
        System.out.println("--------------------");
        // How abotut if i want to compare the values of Strings.
        //.equals(""); compare exact values and return boolean
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name2.equals(name3 ));

        System.out.println(name.equals("Micky"));
        System.out.println(name.equals(new String ("Micky")));//i can assign while i`m comparing.
        System.out.println("Micky".equals(name2));

        System.out.println(new String ("Micky").equals(name3) );
        System.out.println(new String ("Micky").equals(name3));

        String str1 = new String ("Micky");
        String str2  = new String ("Micky");

        System.out.println(new String("Micky Mouse").equals(new String("Micky Mouse")));

        System.out.println("today".equals("TODAY")  );// false uppercase and lower case

        System.out.println("------------" );
        // # 2 .equalsIgnoreCase
        String word1="Monday";
        String word2="MONDAY";
        System.out.println("Ignore Case and Compare: "+ word1.equalsIgnoreCase(word2));
        String word3=" Monday";//space at the beginning.
        System.out.println(word1.equalsIgnoreCase(word3));




        System.out.println("------------" );





        // lenght #3 number of characters
        String last= "Loopcamp";
        int countLetters= last.length();
        System.out.println(last.length());
        System.out.println("countletters: "+countLetters);




        //System.out.println(4.equals(4)); it doesnot work because is a different datatype
        System.out.println("4".equals("4"));




    }
}
