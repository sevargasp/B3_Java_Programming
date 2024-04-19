package day11_statements;

public class TernaryExample     {
    public static void main(String[] args) {
        int a= 7;
        String evenOrOdd;
        //Approach 2  WITH IF ELSE

        if(a % 2 == 0) {
            evenOrOdd = "Even";
        } else { evenOrOdd= "Odd";}

        System.out.println("The number is "+ evenOrOdd);

        //Approach 2 WITH TERNARY
        evenOrOdd=(a % 2 ==0) ? "Even" : "Odd";
        System.out.println("The number is "+evenOrOdd );
        System.out.println("--------------------");

        int num= -4;
        String possOrNeg;
        if(num>=0) {possOrNeg="Possitive"   ;
        System.out.println("The number is"+ possOrNeg);} else {possOrNeg="Negative";
            System.out.println("The number is "+possOrNeg);}

        System.out.println(possOrNeg);

        possOrNeg= (num>=0) ? "Possitive" : "Negative";//ternary

        System.out.println(possOrNeg);

        System.out.println("-------------------------");

        int time=12;
        double price;

        price= (time <=15 && time >=10)? 7.99: 18.99;//ternary

        System.out.println("the price is " +price);

    }
}
