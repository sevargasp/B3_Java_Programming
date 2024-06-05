package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy store1 = new BestBuy("Fairfax, VA");
        BestBuy store2 = new BestBuy("Bergenfield, NJ");
        BestBuy store3 = new BestBuy("Boston, MA");


        //System.out.println(BestBuy.location); // NOT VALID -for instance variable
        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);//i can reach by Object aswell, but the static variable are reached just through class
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println();
        store1.headquarters = "Tysons, 123 Test St, VA, United States";//cambiar solo una copia de solo uno, modifica la de todos, porque solo hay una copia de eso.
        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);


        System.out.println();
        store3.headquarters = "Chantilly, 987 Check Dr, VA, United States";//se van a cambiar por todos, Solo hay una copia de ellos.
        store3.location = "Manhattan, NY";
        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println(store1.headquarters); // We can still call static by object reference but it is NOT good practice.
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);
        System.out.println(BestBuy.headquarters); // Anything static should be called by Class name

        System.out.println("--------------------------------------------");
        store1.openStore();
        store2.openStore();
        store3.openStore();


        System.out.println("--------------------------------------------");
        BestBuy.reStock();//ESTA ES LA MANERA CORRECTA
        store1.reStock(); // You still can call static method by object reference but not good practice
        System.out.println(store1.numOfCompOnSpecialDay);
        System.out.println(store2.numOfCompOnSpecialDay);
        System.out.println(store3.numOfCompOnSpecialDay);


    }
}