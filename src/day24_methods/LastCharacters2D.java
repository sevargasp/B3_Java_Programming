package day24_methods;
import java.util.Arrays;

/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw

 */
public class LastCharacters2D {
    public static void main(String[] args) {

        String[][] words = {
                {"James", "is", "back" },
                {"he", "was", "never", "gone" },
                {"methods", "tomorrow" }
        };
        System.out.println(Arrays.deepToString(words));


        System.out.println("-----------");
        // This is with foreach loop
        for ( String [] eachArr : words) {
            // eachArr -- > this is single array on each cycle
            // System.out.println(eachArr); --> not valid Array printing
            // System.out.println(Arrays.toString(eachArr)); // -- > Correct one

            for ( String eachElem : eachArr) {
                // You can convert each String into char Array and then get the last element as well.
                //System.out.print(eachElem.toCharArray()[eachElem.toCharArray().length -1]);

                System.out.print(eachElem.charAt(eachElem.length() - 1));
            }


            System.out.println();
        }




        System.out.println("-----------");
        // This is with fori loop
        for (int i = 0; i < words.length; i++) {

            // words[i] -- > this is single array on each cycle
            // System.out.println(words[i]); --> not valid Array printing
            // System.out.println(Arrays.toString(words[i])); // -- > Correct one


            for (int j = 0; j < words[i].length; j++) {

                // words[i][j] --- >  String eachElem
                System.out.print(words[i][j].charAt( words[i][j].length() - 1 ));

                // You can convert each String into char Array and then get the last element as well.
                //System.out.print(words[i][j].toCharArray()[words[i][j].toCharArray().length-1]);

            }

            System.out.println();


        }




    }
}


