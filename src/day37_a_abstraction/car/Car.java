package day37_a_abstraction.car;

public abstract class Car {

//    public void start(){
//        System.out.println("Car is running");
//    }


    public abstract void start();

    public void test (){

    }
}
//PRIMER EJERCICIO
//1si pongo el abstract en mi metod, lo debo tener obligatoriamente en la clase tambien.
//2 si comparo abstract con los metodos instanciados en herencia, el abstract forza a los hijos a usarlos. Pero el instanciado solo es a decisi[on y necesidad del usuario.
//3 no puedo tener estatico  o final o abstracto, porque queremos sobreescribirlo, yu para el el metodo estatico, es porque esconde elpadre.
//la idea es que cualquiera que extienda esta clase, sea obligado a usar el abstract metodo.
//cada vez que tengo una clase abstract, no le puedo tener objects.
//si tengo variables instanciadas aun puedo usarlas en los hijos.