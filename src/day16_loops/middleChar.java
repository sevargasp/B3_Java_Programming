package day16_loops;
/*
    [Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.    b) If the length of the string is odd there will be one middle character.
        Ex:
        Input: elephant
        Output: The middle characters: ph
 */
public class middleChar {
    public static void main(String[] args) {
   //"abcdef"--->6 even--> print out middle two "cd"
   //"abcde"--->5 odd--> print middle one 'c'

   String str="abcde";
   String evenOrOdd=" ";
   if (str.length()%2==0) {//even

       evenOrOdd=str.substring(str.length()/2-1,str.length()/2+1);//2,3

    }else {//odd
       evenOrOdd= str.substring(str.length()/2, str.length()/2+1);
}
        System.out.println( evenOrOdd);

    }}
