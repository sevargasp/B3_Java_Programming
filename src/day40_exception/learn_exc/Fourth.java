package day40_exception.learn_exc;

public class Fourth {
    public static void main(String[] args) {

        try {
            System.out.println("Start");
            Thread.sleep(-200);// si alguien da un numero negativo al esperar seria un exception.
//            Thread.sleep(200);  // IllegalArgumentException--->para darle un descanso de tantos segundos, antes de continuar la ejecucion.
            //se usa Thread para el caso que se trabajen con Popups.
            //se creo desde el principio para que se genere un error cuando el usuario lo este implementando.
            System.out.println("End");
        } catch (Exception e){//condicion a manera
            e.printStackTrace();//y dar el resultado.
            //System.out.println(e.getMessage());
        }
        //continua la ejecuici[on.
        System.out.println("END-2");


    }
}
/*
con - 200 sleep
Start
END-2
java.lang.IllegalArgumentException: timeout value is negative
	at java.base/java.lang.Thread.sleep(Native Method)
	at day40_exception.learn_exc.Fourth.main(Fourth.java:8)

Process finished with exit code 0

 */