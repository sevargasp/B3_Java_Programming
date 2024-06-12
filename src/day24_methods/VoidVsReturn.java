package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {

        //String str = sayHello(); // We cannot re-assign this because the method is a VOID method, meaning it does not return anything back
        sayHello();

        String str = sayHello2();
        System.out.println(str);

        System.out.println(sayHello2());
        //System.out.println(sayHello());


    }


    public static void sayHello () {
        System.out.println("Hello");
    }


    public static String sayHello2 () {
        String result = "Hello";
        return result;
    }

}