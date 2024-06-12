package day33_a_static;

public class Iphone {

    // INSTANCE VARIABLE
    String model;
    double price;


    static String company;
    static String os;
    static boolean appleDay;
    static String day;


    // CUSTOM CONSTRUCTOR
    public Iphone (String model,double price) {
        this.model = model;
        this.price = price;
    }


    // STATIC BLOCK - Static initialization - IT WILL RUN FIRST--->similar idea with the constructor
    static {//esto se usa para dar el valor inicial
        System.out.println("STATIC BLOCK RUN:");
        company = "Apple";
        os = "IOS";
        //model = "Ip"; //static can ACCEPT ONLY static//no la puiedo usa rporque es instance variable desde el inicio, no la puedo usar porque es una copia por elemnto, y en la descripcion del static dice que crea una copia original, entonces seria crear varias copias de una copia, esta MAL.
        day = "Wednesday";//in static i can create a if stataments, pero en el lugar que cree mis instance variables, i can not.
        if (day.equals("Friday")) {
            appleDay = true;
        }
    }




    // INSTANCE METHOD
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=$" + price +
                '}';

        //"Company" + company; // INSTANCE can ACCEPT both - static and instance
        //aqui puedo usar variables static porque como es el mismo se usa
    }
}