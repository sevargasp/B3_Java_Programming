package day40_exception.learn_exc;

public class SecondTry {
    public static void main(String[] args) {

        try{
//escribo todas las posibilidades que me pueden causar un problema.
            //String s = null;
            String s = "loop";
            System.out.println(s.length());//si me da el comentado me dara un null point exception porque no puede calcular la longitud.

            int [] a = {1,2,3,4,5};
            System.out.println(a[9]);//me esta pidiendo imprimir el 9, pero mi indice es de 4. entonces desarrollo los dos en el try and catch.
//declarar dos catch, porque si simplemente declaro al papa en el catch, cuando corra mi programa, cualquier primer error que encuentre detendria el codigo, por eso es mejor crear dos catch para que se revise cada statement por individual.
        }catch (NullPointerException e){//este va mas arriba porque se empieza desde el hijo, hacia abajo, de otra manera siempre se capturaria al mismo, y no se llegaria a la otra excepcion.
            System.out.println("Null Pointer Exception is caught");
// deben ser escritos de manera jerarquica.
        } catch (ArrayIndexOutOfBoundsException e){//este esta mas abajo, porque hace parte de mi papa.
            System.out.println("Array Index Out of Bounds Exception is caught");
        }// el dice que hay algo incorrecto pero no para la ejecucion del codigo.
//        con el primer error se sale del catch
//        e es la manera mas usada para llamar las excepciones.

        System.out.println("Done");








    }
}

//all the object default values are null