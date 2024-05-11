package day22_arrays;
/*
    Have a sentence with 3 words
    reverse the middle word

    ex:
        java always fun

        output:
            java syawla fun
 */
public class ReverseMiddleWord {
    public static void main(String[] args) {
        String str = "java always fun";

       String [] words= str.split(" ");

       char[] letters = words[1].toCharArray();//para convertir este String en array y posteriormente en char// otra manera es asignar esa variable a String y usar un loop y char at
        //anterior char es ['a','l','w','a','y','s']

        String reverse="";
        for (int i = letters.length-1;  i >= 0 ; i--) {
            reverse+=letters[i];

        }
        System.out.println(reverse);



    }

}
