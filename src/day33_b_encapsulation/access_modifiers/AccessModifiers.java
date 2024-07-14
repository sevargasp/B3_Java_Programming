package day33_b_encapsulation.access_modifiers;
//AYUDAN A CONTROLAR EL INGRESO DE LOS MIEMBROS A LAS CLASES.
public class AccessModifiers {

    public int a;   // INSTANCE VARIABLE - public access modifier
    int b;          // INSTANCE VARIABLE - default access modifier-PORQUE NO HAY NADA AL INICIO DE MI VARIABLE.
    private int c;  // INSTANCE VARIABLE - private access modifier

//SE PUEDEN TENER LOS MISMOS ACCESS MODIFIERS PARA LAS VARIABLES, PUBLIC, DEFAULT, AND PRIVATE

    public static int x;     // STATIC VARIABLE - public access modifier
    static int y;            // STATIC VARIABLE - default access modifier
    private static int z;    // STATIC VARIABLE - private access modifier

//BASICAMENTE SI ESTOY EN LA MISMA CLASE ESTOY EN EL MISMO PAQUETE
    //In the SAME CLASS - SAME PACKAGE (Automatically in same package)
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();//THIS IS DEFAULT OBJECT
        // Since it is in the same class and package, we can access
        // - public, default and private
        System.out.println(obj.a);//DECLARO EL OBJETO Y LLAMO LA VARIABLE
        System.out.println(obj.b);//DECLARO EL OBJETO Y LLAMO LA VARIABLE
        System.out.println(obj.c);//DECLARO EL OBJETO Y LLAMO LA VARIABLE
        //DESDE QUE ESTEN EN LA MISMA CLASE PUEDO ACCEDER A TODOS ELLOS


        // Since it is in the same class and package, we can access:
        // - public, default and private
        System.out.println(AccessModifiers.x);//SON ESTATICOS ENTONCES LOS LLAMO USANDO LA CLASE ASI ESTE EN LA MISMA, Y VOY Y LLAMO LA VARIABLE AL INTERIOR DE LA CLASE
        System.out.println(AccessModifiers.y);
        System.out.println(AccessModifiers.z);

        //NO PUEDO DECLARAR ACCESS MODIFIERS EN UN MAIN METHOD OR LOCAL VARIABLES
//variables, methodso y constructor can have any access modifier

//las clases solo pueden ser public or default.--->no pueden ser privadas
    }
}
