package day33_b_encapsulation.access_modifiers;

public class AccessInPackage {

    //In the DIFFERENT CLASS - SAME PACKAGE
    public static void main(String[] args) {
        day33_b_encapsulation.access_modifiers.AccessModifiers obj = new day33_b_encapsulation.access_modifiers.AccessModifiers();
        // Since it is in the same class and package, we can access
        // - public, default and private
        System.out.println(obj.a);
        System.out.println(obj.b);
        //System.out.println(obj.c);//ESTE ES COMPLAIN BECAUSE LA VARIABLE ES PRIVADA EN ACCESS MODIFIERS, ENTONCES SOLO PUEDE SER USADA ALLA, DEBE ESTAR EN EL MISMO PAQUETE Y MISMA CLASE

        // Since it is in the same class and package, we can access
        // - public, default and private
        System.out.println(day33_b_encapsulation.access_modifiers.AccessModifiers.x);
        System.out.println(day33_b_encapsulation.access_modifiers.AccessModifiers.y);
        //System.out.println(AccessModifiers.z);SOLO ESTA DISPONIBLE EN LA MISMA CLASE Y PAQUETE,

        /**
         * NOTE:
         *  c and z variables have "private" access modifiers.
         *  That is why they are ONLY accessible in the SAME CLASS
         *  In here, since we are in a different class, we cannot access them
         */

    }

}