package day37_a_abstraction.car;
// CONCRETE class = Non-Abstract class
public class Tesla extends ElectricCar {

    public void start () {
        System.out.println("Star with the card");
    }

    public void charge(){
        System.out.println("Tesla charging");
    }
}
//3 debo overrride del padre y del abuelo, porque es la herencia de otro, entonces estoy forzado a llamar los dos metodos.
// 4 esta es una clase igual, y debe tener el metodo.
//COncrete class= non abstract class
