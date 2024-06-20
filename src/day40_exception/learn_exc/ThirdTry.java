package day40_exception.learn_exc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {//ejemplo con Scanner

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// SE DECLARA POR FUERA DEL SCANNER.

        try {//escribo mi codigo normal, porque es solo posibilidad de que me de error, no estoy seguro que pueda pasar.
//declaro todos los posibles errores.

            System.out.println("Enter a number: ");
            int userNum = input.nextInt(); // One - InputMismatchException
            //en este caso se le pide al usuario que ingrese un numero, y el guevon introduce en letras, o cosas que no son, entoinces puedo manejarlo
            //pensar en los casos que para mi son obvias pero posiblemente para los usuarios no.

            System.out.println("Enter another number: ");
            int userNum2 = input.nextInt();  // InputMismatchException

            System.out.println(userNum / userNum2);  // ArithmeticException---: que introduzca un cero para hacer la division.

        } catch (InputMismatchException e) {
            e.printStackTrace(); // show me the exception in details in CONSOLE--: este me muestra exactamente cual es el error.

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());//este lo DEBO IMPRIMIR PARA QUE ME DE EL RESULTADO, de lo ocntrario, no va aparecer.---: este solo me dice null.
            //e.printStackTrace();
            //para escoger entre uno y el otro, solo dice que hay error(get.message) o el printStack(dice exactamente donde es el error).

        } finally {
            System.out.println("FINALLY BLOCK");//independiente de si encontro error o no, sigame diciendo que ud ya termino la revision. No es MANDATORIA.
            input.close();//esto es solo para saber que se termino.THIS STATEMENTE IS JUST FOR CLOSING THE SCANNER CLASS.
        }//porque debo de tenerlo??porque dado el caso de que no lo tenga, o lo coloque encima en el catch, si nunca capturo error nunca se va a mostrar el finally printStatement.


        System.out.println("DONE");


    }
}