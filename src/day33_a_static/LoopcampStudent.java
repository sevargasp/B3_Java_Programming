package day33_a_static;
//CUANDO UN METODO ES ESTATICO SIGNIFICA QUE LO PUEDO LLAMAR SOLO CON LA CLASS NAME, WIN CREAR OBJETOS.
import java.util.ArrayList;
import java.util.Arrays;

public class LoopcampStudent {

    String name;
    int groupNumber;//si lo vuelvo static todos los estudiantes tendran el mismo numero de grupo

    static int batchNumber;
    static String [] teachers;//solo lo creo, pero en el static lo debo asignar..
    static String schoolName;


    // STATIC BLOCK - it run ONLY ONE TIME, NO IMPORTA SI LO IMPRIMO MAS VECES, SOLO CORRERA UNA VEZ
    static {//EL ESTATICO ES SOLO PARA ASSIGNARLAS//es para initialize

        batchNumber = 3;
        teachers = new String[]{"Nadir", "Feyruz", "James", "Diana"};
        schoolName = "Loopcamp";
        printInfo();
        //no se puede usar el this para este tipo de variabels
    }


    public static void printInfo(){//este es ya es un metodo estatico, es decir no instanciado.
        System.out.println("School Info: ");
        System.out.println("\tSchool Name: " + schoolName );
        System.out.println("\tBatch Number: " + batchNumber);
        System.out.println("\tTeachers: " + Arrays.toString(teachers));
        //System.out.println("Name: " + name ); // CANNOT USE INSTANCE VARIABLES IN STATIC
        //NO PUEDO USAR VARIABLES DE TIPO INSTANCIADO EN UN METODO ESTATICO.
    }

//THIS IS A CONSTRUCTOR
    public LoopcampStudent (String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {//este es solo para instance methods
        return "Loopcamp Student Info: " +
                "\n\tName: " + name +
                "\n\tGroup Number:"  + groupNumber;
    }
}
//LAS VARIABLES INSTANCIADAS NO SE PUEDEN USAR EN METODOS ESTATICOS.

