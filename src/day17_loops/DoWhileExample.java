package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {
        int a = 0;
//        do{
//            System.out.println("Hello");
//    }while (false);//if i wrote here true, it's never going to stop
        do {
            System.out.println(a); //0 1 2 3 4 5 6
            a++;
        } while (a <= 5);
    int a2=0;
    do{
        System.out.println(a2);// 0 5  10 15
        a2+=5;                 // 5 10 15 20
        System.out.println(a2);
    }while(a2<=15);            // 5 10 15 Stop


    System.out.println("--------------");
     int a3=0;
        do {
            System.out.println(a3);}while(a3==10);//it runs once
        // this is a while loop:  which checks CONDITION FIRST and based on the result, it executes the code block
        while(a3==10){//this never gonna run
            System.out.println("always");
    }}}
