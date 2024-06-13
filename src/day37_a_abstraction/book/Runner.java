package day37_a_abstraction.book;

public class Runner {
    public static void main(String[] args) {
        //Create obj = new Create(); // CANNOT create the object of interface


        Book obj2 = new Book();
        obj2.read();
        obj2.write();
        System.out.println(obj2.NAME );//LO PUEDO ACCEDER PORQUE HACEN PARTE DE LA INTERFACE.

    }
}
/*

no puedo llamar un objeto de interface o abstract.

 */

