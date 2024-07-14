package day32_custom_classes;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        Food food1 = new Food("Apple");
        System.out.println(food1);


        System.out.println();
        Food food2 = new Food("Chips", 2);
        System.out.println(food2);
        food2.unitPrice = 1.99;
        System.out.println(food2);//aqui todavia me da 0 el precio, porque no he llamado otra vez a ese metodo.
        food2.calculatePrice();//llame otra vez al metodo para poderlo actualizar e imprimir el verdadero precio, de lo contrario se imprime en ceros. PORQUE EL ORDEN ES DE ARRIBA HACIA ABAJO.
        System.out.println(food2);


        System.out.println();
        Food food3 = new Food("Chicken", 3, 5.99);//cree un objeto con 3 valores.
        System.out.println(food3);//imprimi el objeto completo.
        System.out.println("Lo anterior corresponde a food 3");


        System.out.println();//separador
        food1.quantity = 10;//reassign
        food1.unitPrice = 2.99;//reassign
        System.out.println("food1: " + food1);// va a imprimir todos los valors actualizados, menos el total price que esta en el metodo de calcular el precio.
        food1.calculatePrice();// si yo no tengo esto jamas se me va a actualizar, invlucsive cuando lo tenga en el Array
        System.out.println(food1);

//
        System.out.println("-------------------------");
        String str1 = new String("one");//objects created by keyword
        String str2 = new String("two");//es un tipo de declaraci[on de array
        String str3 = new String("three");
        String[] arr = {"one", "two", "three"}; // Created Array of String - Storing String objects
        String[] arr2 = {str1, str2, str3};//aqui tengo otro array para almacenar estos arrays
        // ESTO ANTERIOR PARA DEMOSTRAR QUE YO TAMBIEN PUEDO ALMACENARLO COMO ARRAY A LOS OBJETOS ANTEIRORES.

//el array basicamente se usa cuando se quiere usar todas las variables de las diferentes copias como al final de esta clase, porque se crea un forloop y se obtienen todos los datos.
        Food[] allFood = {food1, food2, food3, null}; // I stored Food objects into Array of Food----si bien parece rara la creacion de este array tiene sentido puesto que el datatype es Food, como cuando en el array creabamos un datatype de tipo String, ahora este es un array de tipo Food que contiene los objetos de food1, 2, 3.ESTO ES ARRAY NO ARRAYLIST.
        System.out.println(allFood[2]);//es decir food 3,(index) ----->Item: Chicken - 3 x 5.99 = $17.97

//         How can I check how many elements I have in this Food array
        System.out.println("I have total " + allFood.length + " different foods.");//allFood.length para saber cuantos elementos tengo en el array
        System.out.println(allFood[3]);//THIS IS NULL.
        allFood[3] = new Food("Fish", 4, 2.5);//crea y asigna un nuevo objeto pero desde un array index y asignandole mi valor usando los constructor
        System.out.println(allFood[3]);


        System.out.println("=============================");
        for ( Food each : allFood) {//food como es el tyipo de dato debo repetirlo
            System.out.println(each);
        }


        // Can calculate what will be my total cost for all foods
        double totalPriceForAll = 0;//para almacenar la variabel
//por lo siguiente es que necesitamos el array para coger datos de una misma
        for ( Food each : allFood){//this is to get total price of each one
            totalPriceForAll += each.totalPrice;
        }
        System.out.println("Total Price for all foods: " + totalPriceForAll);


        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(Arrays.toString(allFood));//lo cambio para poderlo imprimir, porque es de tipo Array, por eso requiero ToString.

        //find the food which has the total price more than $10.
        String eachFood = "";
        for(Food each : allFood){//estoy entrando en el array y en cada food, cojo lo que tengo despues del punto en el if statement.
            if (each.totalPrice>10){
                eachFood+=each.name+" ";

            }

        }
        System.out.println(eachFood);

    }
}