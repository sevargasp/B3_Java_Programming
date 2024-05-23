package day19_nested_loops;

public class ReverseMiddle {
    /*
    Reverse only second word [String, Loops]

    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
        Ex:
        I love java

        Ouput:
        I evol java
 */
    public static void main(String[] args) {
        String str="You love java";
        int firstSpaceIndex=str.indexOf(" ");//3
        int lastSpaceIndex= str.lastIndexOf(" ");//8
        String middle=str.substring(firstSpaceIndex+1, lastSpaceIndex);
        System.out.println(middle);//love
        String reversed="";

        for (int i = middle.length()-1; i >=0 ; i--) {
            reversed +=middle.charAt(i);

        }
        System.out.println(reversed);
        //you evol java
        //"you love java"
        System.out.println(str.substring(0,firstSpaceIndex+1)+reversed+str.substring(lastSpaceIndex));
    }
}
