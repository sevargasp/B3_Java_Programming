package day15_string;

public class MergeStrings {
    public static void main(String[] args) {
        String str1="abc";
        String str2="xyz";

        //System.out.print(""+str1.charAt(0)+str2.charAt(0)+str1.charAt(1)+str2.charAt(1)+str1.charAt(1)+str2.charAt(1)); it is the first way, but you have another way
        //shorthand operators.

        String merge="";
         merge+=""+str1.charAt(0)+str2.charAt(0);
         merge+=""+str1.charAt(1)+str2.charAt(1);
        merge+=""+str1.charAt(2)+str2.charAt(2);
        System.out.println(merge);

        System.out.println("-------------------");

        int i=0;




    }
}
