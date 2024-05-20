package day26_methods;

public class TypePromotion {
    public static void main(String[] args) {

        use(5L);
        use(3);
        use(1.2f);
        use(3.5);

        use((double)3); // use(3.0);

    }


    // byte, short, int, long, ---- float, double

    public static void use (float f){
        System.out.println("calling float method");
    }


    public static void use (double d){
        System.out.println("calling double method");
    }


    public static void use (long l) {
        System.out.println("calling long method");
    }
}