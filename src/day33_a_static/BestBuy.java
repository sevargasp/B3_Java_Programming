package day33_a_static;

public class BestBuy {

    // INSTANCE VARIABLE - they belong to object
    String location;


    // STATIC VARIABLE - they belong to Class
    static String headquarters = "Richfield, 7601 Penn Ave S, United States";
    static int numOfCompOnSpecialDay = 100;
    static String specialDay = "Wednesday";//ESTO SIGNIFICA QUE VA  A SER LA MISMA PARA TODOS.


    public BestBuy (String location) {
        this.location = location;
    }

    //--------------------------------------------
    // INSTANCE METHOD
    public void openStore(){
        System.out.println("Opening the location in " + location);
    }

    //STATIC METHOD// iva to reach by class name
    public static void reStock (){
        System.out.println("To day is " + specialDay + ", special day and we are restocking");
        numOfCompOnSpecialDay = 200;
    }

}
//se pueden usar static con variables tambien.
//instanceÑ every object has its OWn copy of Instance variable
//static every object has the same copy of static variables
