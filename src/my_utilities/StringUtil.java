package my_utilities;

public class StringUtil {


    /**
     * Returns the reversed version of string.
     *
     * @return  the reversed sequence of characters in String
     */
    public static String reverse (String word) {

        String reversed = "";
        for (int i = word.length() - 1 ; i >= 0 ; i--) {

            reversed += word.charAt(i);
        }
        return reversed;
    }//make a reusable method.

//    public static void main(String[] args) {
//        String word="Hello";
//
//        System.out.println(reverse(word));
//
//        System.out.println(reverse("loopcamp"));//i can call the method directly
//    }


    /**
     * Returns the formatter version of string.
     *
     * @return  the first letter in UPPER Case and rest in LOWER case as a String
     */
    public static String fixFormat (String str) {

    String result = "";

    // result = (str.charAt(0)+"").toUpperCase() + str.substring(1).toLowerCase();
    result = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

    return result;
}


    /**
     *Returns the number of the characters repeated in String
     * @param word is the String that the method will check
     *
     * @param eachLetter is the char that the method will check how many times it appear
     * @return the number of the letter that  occurred in String
     */
    public static int frequencyOfCharacters(String word, char eachLetter) {
        int count=0;

        for (int i = 0; i <word.length() ; i++) {

            if (word.charAt(i) == eachLetter){
                count++;//contador de letras

            }
        }
        return count;
    }

    /**
     *
     *this is done with two fori
     * @param word The word that we want to check.
     * @return String with the words that appear once
     */
    public static String uniqueCharactersByTwoLoops(String word) {
        int count=0;
        char letter;

        String unique="";
        for (int i = 0; i < word.length(); i++) {

            count=0;
            letter=word.charAt(i);

            for (int j = 0; j < word.length(); j++) {

                if (letter==word.charAt(j)){

                    count++;
                }

            }if(count<=1){
                unique+=""+letter;

            }
        }
//        System.out.println(unique);
        return unique;
    }

    /**
     * This method returns only the UNIQUE characters
     * @param str-is the word that is being checked for uniques chars
     * @return the unique lletter as a String
     */

    public static String uniqueCharacters (String str) {


        String unique = "";

        for (int i = 0; i < str.length(); i++) { // hello

            char eachLetter = str.charAt(i);


            if (frequencyOfCharacters(str, eachLetter) == 1) {//i dont have to call, because it is the same class
                unique += eachLetter;
            }

        }

        return unique;
    }


}