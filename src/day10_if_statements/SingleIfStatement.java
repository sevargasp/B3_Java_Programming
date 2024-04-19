package day10_if_statements;

public class SingleIfStatement {
    public static void main(String[] args) {
        if (false) { System.out.println("Hello World");
        }

        System.out.println("Second print statement");
        if (true) {
            System.out.println("Today is Wednesday");     }


        int score= 68;
        if (score>=75){
            System.out.println("passing the exam!");
        }

        if (score<75){
            System.out.println("Failing the exam!");
        }

        int year=2021;
        boolean islockdown=year == 2020 || year ==2021;
        if (islockdown){
            System.out.println("Stay at home");
            System.out.println("Practice CODING");



    }

    }

}


