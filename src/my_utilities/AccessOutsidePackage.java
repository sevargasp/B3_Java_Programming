package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifiers;

public class AccessOutsidePackage {

    //In the DIFFERENT CLASS - DIFFERENT PACKAGE
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        // Since it is in the same class and package, we can access
        // - public, default and private
        System.out.println(obj.a);
        //System.out.println(obj.b);
        //System.out.println(obj.c);
/*  b and y variables have "default" access modifiers
         *  That is why they are ONLY accessible in the SAME PACKAGE
*/
        // Since it is in the same class and package, we can access
        // - public, default and private
        System.out.println(AccessModifiers.x);
        //System.out.println(AccessModifiers.y);
        //System.out.println(AccessModifiers.z);


        /**
         * NOTE:
         *  c and z variables have "private" access modifiers.
         *  That is why they are ONLY accessible in the SAME CLASS
         *  In here, since we are in a different package, we cannot access them
         *
         *
         *
         *  b and y variables have "default" access modifiers
         *  That is why they are ONLY accessible in the SAME PACKAGE
         *  In here, since we are in a different package, we cannot access them
         */

    }
}