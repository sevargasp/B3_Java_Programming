package day37_a_abstraction.language;

public class Spanish implements Language {

    @Override
    public void hi() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}
/*1 debo implementar el abstract method.
 *
 *
 *
 * */
