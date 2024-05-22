package day27_wrapper_arraylist;

public class YahooSearch {
    public static void main(String[] args) {

        // About 7,080,000 search results
        String result = "About 7,080,000 search results";
        String []  arr = result.split(" ");    // ["About",  "7,080,000",  "search", "results"]

        String resultStr = arr[1].replaceAll(",", ""); // "7,080,000" --- > "7080000"
        //resultStr = resultStr.replaceAll(",", "");



        long resultNum = Long.parseLong(resultStr);


        // Your task: After searching make sure the number is bigger than or equal 0
        if (resultNum >= 0){
            System.out.println("TEST CASE PASSED - POSITIVE TEST CASE");
        } else {
            System.out.println("TEST CASE FAILED");
        }



        System.out.println("After searching for \"Apartments\" " + "I see " + resultNum + " results");
        System.out.println("Next Year, after searching for \"Apartments\" " + "I will most likely see " + (resultNum + 1_000_000) + " results");




    }
}