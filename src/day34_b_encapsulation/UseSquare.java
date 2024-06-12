package day34_b_encapsulation;

public class UseSquare {
    public static void main(String[] args) {

        Square obj = new Square(-5);
        // obj.side = 5; // since side variable is private, cannot access directly.

        System.out.println(  obj.getSide()  ); // 0 | 5

        obj.setSide(11);
        System.out.println(  obj.getSide()  );


        System.out.println(obj);



    }
}

    //no puedo ver la variable si no tengo el get, si la quiero ver, debo hacerlo por el get, de lo contrario es prohibido.
