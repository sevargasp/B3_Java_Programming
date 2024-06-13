package day37_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {
        //Language obj = new Language();  // cannot create an object of interface


        Spanish s = new Spanish();
        s.hi();
        s.bye();
        System.out.println(s.PLANET);

        System.out.println("----");

        Turkish t = new Turkish();
        t.hi();
        t.bye();
        System.out.println(t.PLANET);


        System.out.println("-----");
        System.out.println(Language.PLANET);
        System.out.println(Turkish.PLANET);
        System.out.println(Spanish.PLANET);


    }
}
/* i can not create an object of interface
 *
 *
 *puedo acceder a la interface por los objetos de las clases, pero no por objeto del interface.
 *
 * si puedo obtener algo especifico de la variable Language.PLANET, porque es estatico, pero no crear un objeto.
 *
 * */
