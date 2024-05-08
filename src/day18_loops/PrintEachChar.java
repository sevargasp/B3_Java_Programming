package day18_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str="loop";
//        char letter=str.charAt(0);
//        for (int i = 0; i <4 ; i++) {
//            System.out.println(str.charAt(i));

        String loopCamp="loopcamp";
        for (int i = 0; i <=loopCamp.length()-1 ; i++) {/* I have 2 options, leave the length with -1, therefore my logical operator is equal bigger than, or the other option without logical operator*/
            System.out.println(loopCamp.charAt(i));

        }
    }
}
