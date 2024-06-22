package day41_collection.recap;

import java.util.ArrayList;
import java.util.Locale;

public class RecapTry {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList <>();
        list.add("java");
        list.add("api");
        list.add("ci/cd");




        try {
            System.out.println(list.get(1)); // user will give index
            //si hay erro debo crear try and catch o la posibilidad
            String s = null;
            s.toLowerCase();

        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("Index Out Of BoundsException");
        } catch (NullPointerException e){
            System.out.println("No Object Found");
            //e.printStackTrace();
            System.out.println(e.getMessage()); //e.getmessage debe ser con .sout.
        }

        System.out.println(list);
        System.out.println("Done");


        try {
            Thread.sleep(2);//InterruptedException--> this is for handle the compile error.
        } catch (InterruptedException | IllegalArgumentException e ){//aqui podria manejarlo con exception,pero como esta declarado quedo cubierto ambas posibilidades run time con illegal argumentation y el compilate with Interrupted Exception
            System.out.println("Number is wrong");
        } finally {
            System.out.println("This will always run");
        }


        System.out.println("FINAL");


    }
}


//sout list.get(4))--->user will give index.




    // no alcanzo el done porque no estaba en el manejo del error.



    //al primer match, salta la otra parte del try, y busca el catch, y lo captura

    //once i reach the exception, it jumps into the catch, and the runner ignores the missing parts in the try followed by the code(for instance, sout "done"
    // with the single | or & we are forcing to check the other part.



