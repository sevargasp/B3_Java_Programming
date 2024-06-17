package day39_a_polymorphism.poly;

import java.util.Arrays;

class A {
    @Override
    public String toString() {
        return "A";
    }
}

class B1 extends A {
    @Override
    public String toString() {
        return "B1";
    }

}
class B2 extends A {
    @Override
    public String toString() {
        return "B2";
    }
}

class C1 extends B1 {
    @Override
    public String toString() {
        return "C1";
    }
}

class D {
    @Override
    public String toString() {
        return "D";
    }
}




public class PolymorphicArray {
    public static void main(String[] args) {

        String []  str = {"Hi", "Bye"};
        int [] num = {1,2,3};

        D [] obj1 = new D[4];// Declared an array of D class which can hold objects of D and has sized of 4
        obj1[0] = new D();
        obj1[1] = new D();
        System.out.println(Arrays.toString(obj1));
        //obj1[1] = new C1();//no lo puedo tener porque array solo soporta el mismo data type


        A [] obj2 = new A[5]; // POLYMORPHIC array
        // POLYMORPHIC array --> can store Itself and any child class object (or any parent with downcasting)
        obj2[0] = new A();
        System.out.println(Arrays.toString(obj2));
        obj2[1] = new B1();
        obj2[2] = new B2();
        obj2[3] = new C1();



        B1 [] obj3 = new B1[4];
        obj3[0] = new B1();
        obj3[1] = new C1();
        //obj3[2] = new A();//no funciona porque estoy tratando de almacenar algo mas grande que el objeto
        obj3[2] = (B1)new A();//aqui si puedo hacerlo porque hice el downcasting para estar al mismo nivel de B1
        //obj3[3] = new B2();//aqui no puedo porque son hermanos// o no pueod hacerle downcasting porque no tienen ningun tipo de relacion.
        //obj3[3] = (B1)new B2();



        Object [] o = new Object [2];
        o[0] = new A();
        o[1] = new D();
    }
}