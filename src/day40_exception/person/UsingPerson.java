package day40_exception.person;

public class UsingPerson {
    public static void main(String[] args) throws Exception {

        Person obj = new Person();//OBJETO D ETIPO PERSONA. Y ALLI TENGO 2 VARIABLES NO INICIADAS, SOLO INSTANCIADAS DE TIPO PRIVADA.

//        obj.setName(""); porque si lo hago por fuera no me captura esto.
//        obj.setName("Jhon");estas son las dos posibilidades.

        try {
//            obj.setName("Jhon");
            obj.setName("");//cuando esta este vacia y revise PERSON mis comentarios y explicacion.

        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());--este me da el mensaje:"Name cannot be empty"
        }

        System.out.println(obj.getName());//no imprime nada porque no fue setted up nada.

//        obj.setName("");
//        System.out.println(obj.getName());
        System.out.println("Hello");
        System.out.println("Here, I ended my first try and catch");


        try {
            //creo un metodo para poder capturar la edad en los rangos que no quiero, y si me envia alguno de los valores que yo no deseo, entonces, estaria otorgandole una exception.
            obj.setAge(130);//esto es porque mi variable es instanciada pero no instanciada de la clase persona y sus variables.
        } catch (
                RuntimeException e) {//aqui debo de manejarlo porque si es mi clase corredora o ignorar la clase desde el throws.//aqui puse al papa del RuntimeException.
            System.out.println(e.getMessage());//este solo me imprime  en el lugar donde esta situado.
            System.out.println("Este es el error");
//            e.printStackTrace();//este me imprime en letra roja toda la excepcion, pero al inicio del runtime.
        }
        System.out.println("Bye");

        obj.setName("Mike");


    }
}