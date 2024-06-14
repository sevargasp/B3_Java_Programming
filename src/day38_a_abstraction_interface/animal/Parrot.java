package day38_a_abstraction_interface.animal;
import day37_a_abstraction.language.Language;

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void useWings() {
        System.out.println("Parrot is using wings to fly");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating seeds");
    }

    @Override
    public void fly () {
        System.out.println("Parrot is flying");
    }


    @Override
    public void hi() {
        System.out.println("HI HI");
    }

    @Override
    public void bye() {
        System.out.println("BYE BYE BYE");
    }
}
/*
* en esta clase, si no tengo abstract, no requiero hacer implementation, a no ser que declare un nuevo metodo en Bird abstract class.
* ALT+INSERT
* si la conecto a interface, debo de implementar
*
*
*
*
*
* */
