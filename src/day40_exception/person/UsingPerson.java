package day40_exception.person;

public class UsingPerson {
    public static void main(String[] args) throws Exception {

        Person obj = new Person();//OBJETO D ETIPO PERSONA. Y ALLI TENGO 2 VARIABLES NO INICIADAS, SOLO INSTANCIADAS DE TIPO PRIVADA.

//        obj.setName("");
//        obj.setName("Jhon");estas son las dos posibilidades.

        try {
//            obj.setName("Jhon");
            obj.setName("");//cuando esta este vacia y revise PERSON mis comentarios y explicacion.

        } catch (Exception e){
            e.printStackTrace();
//            System.out.println(e.getMessage());--este me da el mensaje:"Name cannot be empty"
        }

        System.out.println(obj.getName());//no imprime nada porque no fue setted up nada.

//        obj.setName("");
//        System.out.println(obj.getName());
        System.out.println("Hello");
        System.out.println("Here, I ended my first try and catch");


        try {
            obj.setAge(130);//esto es porque mi variable es instanciada pero no instanciada de la clase persona y sus variables.
        }catch (RuntimeException e){//aqui debo de manejarlo porque si es mi clase corredora o ignorar la clase desde el throws.
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Bye");

        obj.setName("Mike");


    }
}