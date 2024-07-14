package day38_a_abstraction_interface.interface_methods;

public interface Mac {


    // We can have 4 things in Interface
    // Everything in interface has "public" access modifiers

    //#1 - public static final variables - CONSTANTS
    String NAME = "MAC";  // public static final
    String OS = "iOS";


    //#2 - abstract methods
    void turnOn();  // public abstract



    // Q: How do I have a method in interface with BODY / CODE BLOCK
    // A: 2 options - 1) static method, 2) default method


    //#3 - 1) - static method
    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New release normally is in Nov");
    }


    //#4 - 2) - default method
    // NOTE: "default" here is NOT ACCESS MODIFIER
    public default void faceTime(){
        System.out.println("Opening Facetime");
        System.out.println("Calling someone");
    }
}

/*
*
* CADA VARIABLE DEBE SER PUBLIC STATIC FINAL, PERO NO LA HE ASIGNADO AL INICIO, PERO TIENEN QUE ESTAR COMO TAL LA VARIABLE DECLARADA Y ASIGNADA.
*
* default in interface is NOT AN ACCESS MODIFIER. 
*
*se necesita implementar solo el abstract method que seria el void turnOn(), porque no tiene el access modifier, sobreentendiendo que es public y abstract
*
* */
