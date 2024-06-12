package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String str = "loopcamp";
        char [] letters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            letters[i] = str.charAt(i);
        }

        System.out.println(Arrays.toString(letters));

//lo que s ehace debajo es lo mismo que hicimos previamente.
        char [] letters2 = str.toCharArray();
        System.out.println(Arrays.toString(letters2));


        System.out.println("----------");
        String word = "java";

        //word.toCharArray(); //"java" ------ > ['j', 'a', 'v', 'a']

        for ( char each : word.toCharArray()) {
            System.out.println(each);
        }
        System.out.println("----------");
        String words = "javav";

        //word.toCharArray(); //"java" ------ > ['j', 'a', 'v', 'a']
        //System.out.println(Arrays.toString(word.toCharArray()).substring(1, Arrays.toString(word.toCharArray()).length()-1));

        System.out.println(Arrays.toString(words.toCharArray()));

        for ( char each : words.toCharArray()) {
            System.out.println(each);
        }


        System.out.println("-----------");
        char [] letters3 =  {'j', 'a', 'v', 'a'};
        System.out.println(Arrays.toString(letters3));

        for ( char each : letters3) {
            System.out.println(each);

//THIS IS HOW WE CONVERT FROM CHART TO String
        System.out.println("-------------LETTERS4---From char to String");
        char [] letters4={'h','e','l','l','o'};
            System.out.println( "char: "+letters4[0]);
            System.out.println("char in int: "+ (int)letters4[0]);
        String str2= new String(letters4);
            System.out.println(str2);


            System.out.println("mire el codigo, no puede devolver deString a otros strings");
//            String str3 = new String(words); INVALIDO, SOLO FUNCIONA CON CHART ARRAY



    char[] ascii ={104,105,106,107,108};
            System.out.println("asccii: "+ascii[0]);

            String str4= new String (ascii);
            System.out.println(str4);

    String s="jerry";
    char [] ch=s.toCharArray();
            System.out.println(Arrays.toString(ch));//solo lo converti a string para imprimirlo


    String s2= new String();
            System.out.println(s2);

    }
}
}
