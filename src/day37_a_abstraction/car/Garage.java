package day37_a_abstraction.car;

public class Garage {
    public static void main(String[] args) {

        //Car obj1 = new Car(); // We CANNOT create the object of ABSTRACT CLASS
        //obj1.start();


        Toyota obj2 = new Toyota();
        obj2.start();

        Honda obj3 = new Honda();
        obj3.start();

        // Both Toyota and Honda are CONCRETE classes.
        // Because they're not ABSTRACT class, we had to implement abstract methods from abstract parent class


        //ElectricCar obj4 = new ElectricCar();  // We CANNOT create the object of ABSTRACT CLASS


        System.out.println();

        Tesla obj5 = new Tesla();
        obj5.start();
        // .start(); //it was DEFINED in Car class but implemented in Tesla class
        obj5.charge();
        //.charge(); //it was DEFINED in ElectricCar class but implemented in Tesla class


        // Tesla is a non-abstract class (CONCRETE class), so it was required to implement ALL abstract method from all abstract parent classes
    }
}
//1 pero ya me dan errores mis objetos de papa, porque yo no puedo crear un objeto de UNA CLASE ABSTRACTA.
//
