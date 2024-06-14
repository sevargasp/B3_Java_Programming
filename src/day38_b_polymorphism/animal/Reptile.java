package day38_b_polymorphism.animal;

public class Reptile extends Animal {

    int numOfLegs;

    @Override
    public void eat() {
        System.out.println("REPTILE is eating");
    }
}
/*
* puebo override sin el abstract solo a necesidad.
*
*la referencia determina la accebilidad del metodo.y puede dar complains. pero cuando lo corro, alcanza el nivel del hijo cuando corre. pero por accesibilidad debo tenerlo en el padre.
*
*
* */
