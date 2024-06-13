package day37_a_abstraction.gym;

public class Running extends Exercise {

    public Running(String name) {
        super(name);
    }

    public void performExercise(){
        System.out.println("Running " + name);
    }

    public int burnCalories (int minutes){
        return minutes * 5;
    }

}
/*
si mi abstract tiene constructor, DEBO  implementar mi  constructor aqui tambien.
y obviamente si tiene el metodo, debo de override aqui, o me dara error,
ya esta seria mi clase concrete?

si yo tengo otro metodo que reciba y entregue variables, igual los debo llamar aqui porque obligatoriamente deben ser abstractas pero el nombre de la variabnle no ntiene que ser el mismo que el del padre. por ejem int min, y en el padre es llamado int minutes.
una clase constructora puede ser inicializada.
 */