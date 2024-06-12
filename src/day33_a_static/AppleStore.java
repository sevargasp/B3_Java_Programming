package day33_a_static;

public class AppleStore {

    public static void main(String[] args) {

        Iphone phone1 = new Iphone("Iphone 14 Pro", 1099.00);
        System.out.println(phone1);

        Iphone phone2 = new Iphone("Iphone 15 Pro MAX", 1199.00);
        System.out.println(phone2);

        System.out.println(Iphone.company);
        System.out.println(Iphone.os);




    }

}