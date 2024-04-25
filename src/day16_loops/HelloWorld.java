package day16_loops;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        int num=1;
        while(num<=100) {
            System.out.println("Hello World");
            num++;//num=num + 1;
        }
        System.out.println("-------");

        int num2=100;
        while(num2<=100){
            System.out.println("Hello World");
            num2++;//if I remove this statment it is going to run forever.
                  }
//        System.out.println("-------");
//        while(true) System.out.println();
        System.out.println("-------");

        int z=1;
        while(z<=50){
            System.out.println("Line " +z++);

    }
}}