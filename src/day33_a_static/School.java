package day33_a_static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        LoopcampStudent student1 = new LoopcampStudent("Elina", 3);
        System.out.println(student1);

        LoopcampStudent student2 = new LoopcampStudent("Aygun", 3);
        System.out.println(student2);

        System.out.println();
        LoopcampStudent.printInfo();//lo llama desde la clase porque es un metodo estatico


        // can you get me the name of the teachers.
        System.out.println();
        System.out.print("Teachers at Loopcamp: "+ Arrays.toString(LoopcampStudent.teachers));//LLAMAR A LA CLASE Y DESPUES LLAMAR EL ARRAY STRING.


        System.out.println();
        int i = 0;
        for ( String eachTeacher : LoopcampStudent.teachers){
            System.out.println("Teacher " + ++i + ": "+ eachTeacher);
        }



    }
}