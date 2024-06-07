package day35_inheritance.recap;

public class PizzaStore {

    public static void main(String[] args) {

        Pizza p1 = new Pizza("Hello", 6); // small, medium, large
        //p1.size = "Hello"; // Since it is encapsulated, cannot reach directly
        System.out.println(p1);


        Pizza p2 = new Pizza("Medium", 6); // small, medium, large
        System.out.println(p2);


    }

}
//desde que la variable instanciada sea de tipo privada, no puedo asignarle nada