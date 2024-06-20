package day40_exception.person;

public class Person {

    private String name;//ENCAPSULO LAS VARIABLES
    private int age;//ENCAPSULO LAS VARIABLES --->SOLO ACCEDO A ELLAS POR PUBLIC GETTERS AND SETTERS
//PARA ASIGNARLES UN VALOR ASI SEA UNAS VARIABLES DE INSTANCIA LLAMO A LOS GETTERS(IMPRIME) Y SETT(LOS ASIGNA)
    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == null || name.isEmpty()) {//CON ESTO MANEJO LA SITUACION DE QUE NO SEA NI NULL, NI VACIO...
            //YO PUEDO CREAR UN SOUT(NAME CAN NOT BE EMPTY) PERO ESTO SOLO SE IMPRIME, MAS NO SE MANEJA.
            //System.out.println("Cannot assing");

            throw new Exception("Name cannot be empty");//SE CREA UN OBJETO, PERO NO SE DECLARO, Y QUE RETORNE EL MENSAJE QUE SE TIENE.
            //THROW DEPENDE DEL THROWS, ES DECIR QUE SI NO LO TENGO EN EL SIGNATURE DE ESTE METODO, ENTONCES ME VA A MOSOTRAR ERROR.
            //ESTO ES TODAVIA PARA IGNORARLO, DARLE UN MENSAJE,
            //TODAVIA NO HA SIDO MANEJADO.
            ///ESTO SOLO PASA CUANDO LO ESTE CORRIENDO.
            //THROW ES PARA ENVIAR MENSAJE MANUAL.
            //ESTE ERROR ES POR COMPILAR PORQUE SI NO TENGO LO INICIADO NO PUEDO HACER NADA. POR ESO USO EL TIPO EXCEPTION PARA QUE COJA LOS DOS.
            //CON ESTE SI LO PUEDO LLAMAR DESDE MI MAIN CON E.GETMESSAGE.

        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {//se crea con if porque es una condicion, no siempre ha de ser buena o MALA.**
//        Aqui no tengo que declarar el throws, porque quiero manejar el Runtime exception, y esta clase nunca se va a correr, porque el objeto throw new, es la misma exception.
        if (age < 0 || age > 120) {//creo estos dos porque son los erroneos, entonces cuando este fuera de ese valor arroje esto.
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.age = age;//de lo contrario si el valor esta bueno, vaya y arroje esto.
    }
}
