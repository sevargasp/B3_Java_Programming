package day18_loops;

public class Backwards {
    public static void main(String[] args) {

        //can you print the numbers STARTING FROM 20 and print it until 0
//        for (int i = 20; i >=0 ; i--) {
//            System.out.println(i);
//        }

        String str="loop";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));}

        }
    }
