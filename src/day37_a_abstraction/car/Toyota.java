package day37_a_abstraction.car;

//non-abstract class / CONCRETE class
public class Toyota extends Car{


    public void start(){
        System.out.println("Press Button");
    }

}
//1 COMO esta tambien es hija de carro, DEBO usarla e implemetnarla obligatoriamente.
// 2si creo un metodo instanciado en mi padre (CAR) no debo tenerlo aqui.
//concrete class, es la primera clase sin ser abstract class pero en la herenecia
