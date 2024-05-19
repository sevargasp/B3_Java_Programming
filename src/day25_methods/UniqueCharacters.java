package day25_methods;

import my_utilities.StringUtil;

/*
    Unique Characters

    create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

    Hint: use your frequency method to do some of the work

    Ex:
    Input:
        aaaaabcccdeeff

    Output:
        bd
 */
public class UniqueCharacters {

    public static void main(String[] args) {

        String str=" aaaaabcccdeeff";
//        int count=0;
//        char letter;
//
//        String Unique="";
//        for (int i = 0; i < word.length(); i++) {
//
//            count=0;
//            letter=word.charAt(i);
//
//            for (int j = 0; j < word.length(); j++) {
//
//                if (letter==word.charAt(j)){
//
//                    count++;
//                }
//
//            }if(count<=1){
//                Unique+=""+letter;
//
//            }
//        }
//        System.out.println(Unique);
//        System.out.println(uniqueCharacters(input));//esto fue sin haberlo terminado.
        System.out.println(StringUtil.uniqueCharacters(str));
        //tengo asignado 2 loops, 1 en cada method

    }

//    public static String uniqueCharacters(String word) {
//        int count=0;
//        char letter;
//
//        String unique="";
//        for (int i = 0; i < word.length(); i++) {
//
//            count=0;
//            letter=word.charAt(i);
//
//            for (int j = 0; j < word.length(); j++) {
//
//                if (letter==word.charAt(j)){
//
//                    count++;
//                }
//
//            }if(count<=1){
//                unique+=""+letter;
//
//            }
//        }
////        System.out.println(unique);
//        return unique;
//    }
}
