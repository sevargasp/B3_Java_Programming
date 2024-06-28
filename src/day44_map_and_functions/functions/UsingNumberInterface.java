package day44_map_and_functions.functions;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (number) -> {
            if(number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        };


        evenOrOdd.apply(5);
        evenOrOdd.apply(10);
        evenOrOdd.apply(123);
        evenOrOdd.apply(456);

        System.out.println("------------------");


        // if you abstract method accepts 1 argument using () parenthesis is optional
        // If your code has only 1 statement {} curly bracket is also optional
        // Like the sample below
        NumberInterface cube = n ->
                System.out.println(n * n * n);
        // or we can do it like this:
        //NumberInterface cube = (n) -> {
        //        System.out.println(n * n * n);
        //};



        cube.apply(5);




        System.out.println("------------------");
        A a = new A();
        a.apply(4);

        B b = new B();
        b.apply(3);


    }
}