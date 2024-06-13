package day37_a_abstraction.car;

//non-abstract class /CONCRETE class
public class Honda extends Car {

    //@Override
    public void start(){
        System.out.println("Insert Key");
        System.out.println("Turn Key");
    }

}
//1me dan error al inicio cuando pongo el abdstract en mi padre. para solucionarlo debo de override, OBLIGATORIO.
// 2si creo un metodo instanciado en mi padre (CAR) no debo tenerlo aqui.