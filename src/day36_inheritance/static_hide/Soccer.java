package day36_inheritance.static_hide;

public class Soccer extends Sports {

    //@Override - static methods do NOT get Overridden
    public static void cheer(){
        System.out.println("Cheering from the Child Class");
    }

    /*
        Note:
            It looks like we are overriding
            But we are NOT, because the method is - static

            We are hiding the cheer() method from parent class
     */

}
/*
desde que se tenga el mismo metodo estatico declarado en el child class, este ignorara el padre.
si no hay metodo en el child, incluso si lo llamo por objeto atraves de runner, el me mostrara el padre.



parece como overriding, sin emabrgo no se da porque es estatico.

 */