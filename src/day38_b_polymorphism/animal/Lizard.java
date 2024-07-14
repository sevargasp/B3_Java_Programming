package day38_b_polymorphism.animal;

public class Lizard extends Reptile {

    String skinColor;

    @Override
    public void eat() {
        System.out.println("LIZARD is eating");
    }
}
/*
 *puedo ademas tener mis propias instance variables.
 *puebo override sin el abstract solo a necesidad.
 *PUEDO run si no tengo el metodo aqui.
 *
 * */