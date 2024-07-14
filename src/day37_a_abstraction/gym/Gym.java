package day37_a_abstraction.gym;

public class Gym {
    public static void main(String[] args) {

        //Exercise obj1 = new Exercise("Runnig");

        Running obj1 = new Running("Marathon");
        obj1.performExercise();
        System.out.println(obj1.burnCalories(10));


        PullUps obj2 = new PullUps("Crosfit");//esto lo tengo que hacer por mi padre, que es el constructor que declare.
        obj2.performExercise();
        System.out.println(obj2.burnCalories(10));


    }

}
/*
no puedo crear objeto de la clase abstracta.
pero si de mis hijos.
y ahora cuandon cree los objetos de mis clases no abstractas debo de pasarles la variable instanciada del padre que es abstracto.
cada vez que llame a las clases se da prioridad al de la clase que llamo, porque esconde al del padre.
 */