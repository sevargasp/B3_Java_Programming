package day37_a_abstraction.language;

public class Turkish implements Language {



    @Override
    public void hi() {
        System.out.println("Merhaba");
    }

    @Override
    public void bye (){
        System.out.println("Gule Gule");
    }
}
/*
si quiero obtener la informacion desde Language, uso el implements.
*
*
*1 debo implementar el abstract method.
*
*usar el override me permite comprobar si lo override de buena manera, puede que le haya puesto un parametro y no correspondia, u otro tipo de parametro.
*puedo tener varias interfaces.



*/
