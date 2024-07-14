package day37_a_abstraction.gym;

public abstract class Exercise {

    String name;

    //static int count;

    public Exercise(String name) {//constructor
        this.name = name;
    }

    public abstract void performExercise();//metodo tipo void//OBLIGATORIO AL IGUAL QUE LOS CONSTRUCTORES.

    public abstract int burnCalories (int minutes);//metodo que retorna algo, si lo tengo en abstract es porque estoy forzando a mis clases hijas a utilizarlas.

}
/*
abstract no es para saber como lo hace, solo para saber que lo hace.
ASI MI CLASE SEA ABSTRACT, YO AUN PUEDO TENER MI CONSTRUCTOR Y VARIABLE INSTANCIADA, PERO NO PUEDO TENER EL OBJETO DE LA CLASE ABSTRACT.
clase ABSTRACTA NO PUEDE SER INSTANCIADA, SIN EMBARGO SI PUEDE TENER SU CONSTRUCTOR, porque no tiene objeto.
* con una clase final no puedo tenerla abstract, porque abstraerla la debo de reescribir.
 */