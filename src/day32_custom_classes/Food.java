package day32_custom_classes;

/*
    create a class called Food

       - data:

           name, quantity, unit price, total price
*/
/*
    - constructor

        - create a constructor that creates a Food object with the name

        - create a constructor that creates a Food object with the name and quantity

        - create a constructor that creates a Food object with the name, quantity, and unit price
            -> call calculatePrice() method here
*/
/*
    - method:

        - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

        - toString()
            print all the Food information

*/
public class Food {
    //1 INSTANCE VARIABLES
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    //create the constructorwith the name and quantity
    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) { //create a constructor that creates a Food object with the name and quantity
        this(name);//llama a este constructor para ahorrar lineas de codigo
        this.quantity = quantity;
    }

    //ESTE ES CONSTRUCTOR OVERLOADING.
    public Food(String name, int quantity, double unitPrice) {//- create a constructor that creates a Food object with the name, quantity, and unit price
        this(name, quantity);//constructor overloading with 2 spaces.
        this.unitPrice = unitPrice;
        calculatePrice();//si lo resalto y lo dejo ahi, el me dara la opcion de crear el metodo, pero lo dará en privado, ahora bien, yo lo necesito publico, por eso le borro el privado


    }


    public void calculatePrice() {//this is method overloading, lo sabemos por el nombre, es diferente de la clase.
        //totalPrice = Math.round(unitPrice * quantity);
        totalPrice = unitPrice * quantity;//lama directamente a estas variables para usarlas, y es un metodo vacio.
    }

    public String toString() {
        return "Item: " + name + " - " + quantity + " x " + unitPrice + " = $"
                + totalPrice;
    }


}