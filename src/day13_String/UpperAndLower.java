package day13_String;

public class UpperAndLower {
    public static void main(String[] args) {
     String str="sNow";
        System.out.println(str.toUpperCase());

        System.out.println(str);//this prints the initial str, because we did not assign it.


        str= str.toUpperCase();//we created COMPLETELY NEW STRING
        System.out.println(str);


        System.out.println("-----------------"  );

        System.out.println(str.toLowerCase());
        System.out.println(str);//this going to print just the last, because we havent assigned a new value just printed out.
        str=str.toLowerCase();

        System.out.println("---------");
        String word1= "Loop";
        String word2= word1+ "camp";
        System.out.println(word1.toUpperCase() + word2.toLowerCase());//LOOPloopcamp


        System.out.println(word1 + word2); //LoopLoopcamp



    }
}
