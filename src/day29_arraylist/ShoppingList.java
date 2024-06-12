package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList <String> shoppingList = new ArrayList<>();//se declaro la variable

        // Can you make this a reusable method
        System.out.println(  statusOfShoppingList(shoppingList)  );//creo un metodo reusable con return
//para saber si estaba vacio o llena desde el ppio.

        String userAnswer = "";
        do {//uso el do porque primero quiere preguntar y despues definir si continuar.
            System.out.print ("Enter the item: ");
            shoppingList.add( input.nextLine() );

            System.out.print("Do you want to continue y/n: ");
            userAnswer = input.nextLine(); // yes
//manejo todas las posibilidades de rta.
        } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")); // ask as long as user say "Yes", "Yes", "yes, "y", "Y"



        // loop through list//porque queria ahondar en cada uno de los productos, y uso el each porque solo iba a imprimir, entonces al lado izquierdo creo su nuevo String variables y al lado derecho, simplemente opto por pasar a lo largo del array list
        System.out.println("Shopping list has " + shoppingList.size() + " item: ");//esto lo uso para saber el tamano del array y de esa manera conocer los itmes, y con el posterior foreach imprimio cada uno.
        for ( String eachItem : shoppingList) {
            System.out.println("\t" + eachItem);
        }

        System.out.println(statusOfShoppingList(shoppingList));//volvio a llamar este custom method para saber si lo tenia lleno o vacio.

        System.out.println("--------------------");

        // Check if shopping list has an item: $item is on list / $item is not on list
        System.out.print("What item do you want to check if it is in the list? ");
        //input.nextLine(); // hat

        itemAvailability(shoppingList, input.nextLine());//creo a custom method para checkear si esta en la lista.

        System.out.println("--------------------");

        System.out.print ("Do you want to remove any item? ");
        if (input.nextLine().equalsIgnoreCase("yes") ) {//solo manejo una posibilidad por eso la respuesta debe ser concreta.
            System.out.print ("What item do you want to remove: ");
            String itemRemove = input.nextLine();  // user item to remove  --- > "Bread" - "1"/"10"----> aqui el usuario tiene dos posibilidades por index o por nombre especifico, por eso en el siguiente if el revisa el char at 0, porque va a coger el primer digito y verificar si puede ser un digito o no. si no es un digito corre el else/


            // "1"/"10"   -- "Bread"
            if (Character.isDigit( itemRemove.charAt(0) )) {// si es un digito, corre esot y va y transforma el "digito" en Integer para poderlo remover porque es un array listo, y le resta el 1 porque es con indice entonces si el usuario escribio remover el 1, se le resta el 1 para que se comporte como el indice 0.

//                int num = Integer.parseInt(itemRemove); //  "1"/"10" --- > 1, 10
                shoppingList.remove( Integer.parseInt(itemRemove) - 1);

            } else {
                shoppingList.remove(itemRemove);
            }
        }

        System.out.println("Final List: " + shoppingList);


    }

    public static String statusOfShoppingList (ArrayList <String> sl) {//solo para saber el estado del shopinglist.

        return sl.isEmpty() ? "Shopping List is empty!" : "You have some items";

    }

    public static void itemAvailability (ArrayList<String> sl, String itemToCheck) {//metodo para checkear items, no retorna nada, simplemente imprime con un ternary directamente.
        System.out.println( sl.contains(itemToCheck) ? itemToCheck + " is on list" : itemToCheck + " is not on list");
    }


}
