package day18_loops;
/*

    Given a String we want to count how many 'a' characters we have

    Challenge: adjust so that we can check for not only 'a' but any character

    Ex: aabbcaa

        4

 */
public class CountLetter {
    public static void main(String[] args) {
String word= "aabbcaa";
char letter='a';
int count=0;
/* I will get each character -----> word.chartAt(index);
and
compare if it matches-------> word.charAt(index)==letter; ---->count=1
*/
        for (int i = 0; i <= word.length()-1; i++) {
            char eachCharOnEachCycle=word.charAt(i);
        if (eachCharOnEachCycle==letter){
        count++;}
        }
        System.out.println(count);
    }
}
