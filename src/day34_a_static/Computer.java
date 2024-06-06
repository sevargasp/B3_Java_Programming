package day34_a_static;
//1
/*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

 */
public class Computer {
    //Instance variables
    double price;
    String brand;
    String color;

    //static variables
    static boolean hasScreen;//lo hago asi porque sin importar cuantos cree todos tendran la misma informacion, es decir TODOS TIENEN LA MISMA INFORMACI[ON. TODOS LOS OBJETOS DE ESTA CLASE TENDRAN ESA COPIA. LAS VARIBALES ESTATICAS PERTENECEN A LA CLASE
    static boolean hasBattery;
    static boolean hasMemory;

    static {//siempre que llame LA CLASE COMPUTER, SIEMPRE SE CORRERA PRIMERO EL STATIC.
        System.out.println("Running Static Block");
        hasScreen=false;
        hasBattery=true;
        hasMemory=true;
        //aqui no puedo usar variables instanciadas. double price=127.009 ejemplo


    }

    //este constructor lo creo para meter los variables de una vez, y si deseo asignarles valor.
    public Computer(double price, String brand, String color) {
//        price=price;si le quito los comentarios, no me dejar[ia asignarlo a mi instance variables, prque prioiriza los locales, por eso uso el this. //comp1.price=500.00
        System.out.println("Running Constructor. ");
        this.brand = brand;
        this.price = price;
        this.color = color;

    }


}

