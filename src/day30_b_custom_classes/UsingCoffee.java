package day30_b_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();

        coffee1.price = 4.99;
        coffee1.size = 16.0;
        coffee1.brand = "Starbucks";
        coffee1.type = "Latte";
        System.out.println(coffee1); // this will call toString() method

        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();


        coffee1.refill(8);
        System.out.println(coffee1.size);


        System.out.println("-----------");
        Coffee coffee2 = new Coffee();
        System.out.println(coffee2);
        coffee2.drink();
        coffee2.drink();
        coffee2.drink();
        coffee2.drink();
    }
}