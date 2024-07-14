package day44_map_and_functions.functions;

public class UsingDynamicInterface {
    public static void main(String[] args) {

        DynamicInterface <String> printEachChar = (word)-> {
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i));
            }
        };

        printEachChar.test("loopcamp");


        System.out.println("-------------------------------------");


        DynamicInterface <Integer> printNumber5Times = (n)-> {
            for (int i = 0; i < 5; i++) {
                System.out.println(n);
            }
        };

        printNumber5Times.test(7);

    }
}