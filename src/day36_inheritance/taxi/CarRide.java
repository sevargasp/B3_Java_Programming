package day36_inheritance.taxi;

public class CarRide {
    public static void main(String[] args) {

        Lyft obj1 = new Lyft("Tom");
        System.out.println(obj1.calculateRate(10));


        LyftXL obj2 = new LyftXL("Micky");
        System.out.println(obj2.calculateRate(10));

    }
}//si yo quiero initialize the instance variable for this object, i have to create my constructor, es
//es decir que va a desaparecer el constructor default que tenia previamente.
/*
si voy a imprimir el metodo no necesito llamar toString.
si lo voy hacer con object, debo crear el toString.
 */