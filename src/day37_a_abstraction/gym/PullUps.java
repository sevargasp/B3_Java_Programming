package day37_a_abstraction.gym;

public class PullUps extends Exercise{

    public PullUps(String name) {
        super(name);
    }

    public  void performExercise(){
        System.out.println("Doing pull ups of " + name);
    }

    public int burnCalories (int minutes){
        return minutes * 15;
    }
}
/*
como tengo constructor en mi padre abstracto.
debo crear constructor aqui, y aho9ra debo crear el metodo para override.
-aqui tambien tengo que llamar a los metodos abstractos del padre y al constructor por obligaci[on.
 */