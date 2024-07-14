//package day40_exception.throws_keyword;
//
//public class UsingThrows {
//    public static void main(String[] args) throws InterruptedException {//despues del signature debo adjuntar throws InterruptedException(especifico)NO PUEDE SER RUNTIME. Y ESTO HACE QUE IGNORE MI ERORR ESPECIFICO.
////        SOLO FUNCIONA PARA ESTA LINEA, DE ABAJO. LA PRIMERA.
//
//        Thread.sleep(200);// Compile Exception  +  possible RunTimeException
////Thread.sleep(200) SIN EL SEMICOLON SERIA UN COMPILE ERROR.
//        //If I do not want to handle the COMPILE Exception - I have a chance to AVOID it.
//        // I can add the exception into method signature
//
//        test(); // Since we are also ignoring it by main method signature, we are not required to handle COMPILE TIME EXCEPTION in here.
//
//    }
//
//    public static void test () throws InterruptedException {
//        Thread.sleep(200);
//    }
//
//    public static void test2 ()  {
//        //test();
//        //main();
//    }
//}

package day40_exception.throws_keyword;

public class UsingThrows {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(200);// Compile Exception  +  possible RunTimeException

        //If I do not want to handle the COMPILE Exception - I have a chance to AVOID it.
        // I can add the exception into method signature

        test(); // Since we are also ignoring it by main method signature, we are not required to handle COMPILE TIME EXCEPTION in here.
//DESDE QUE LO MANEJE NO DEBO DE IGNORARLO, DE LO CONTRARIO TENGO QUE IGNORAR TODOS.

    }

    public static void test () throws InterruptedException {
        Thread.sleep(200);
    }

    public static void test2 ()  {//AQUI ESTA MANEJANDO EL METODO TEST(), POR ESO YA NO ME DARIA ERROR.
        try{
            test();
        } catch (Exception e){

        }
        //main();
    }


    public static void test3 () {
        test2();
    }

}
