package day40_exception.learn_exc;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First print out");

        String str = "loopcamp";
        //            01234567
//debo pensar en cuales son los posible errores, es decir que cuanod pida al usuario informacion no introduzca la que yo espero.
        try{
            System.out.println(str.charAt(0)); // input.nextInt(); --- >  9
            //todas las posibilidades que me pueden dar error
        } catch (Exception e){//escribo el tipo de excepcion que voy a capturar, entre mas general mas capturo.
            System.out.println("Exception is caught");
        }

        System.out.println("Last print out");

    }
}
/*
*el indice que estoy usando esta por fuera del codigo, me pide por ejemplo el index 8 de loopcamp, entonces no se daria, y seria un erro de runtime. es decir que el error se daria en la clase corredora.
* en el run time, se imprime hasta el punto en el que hay un error.
*
*
*
*
*
*
*
* */
