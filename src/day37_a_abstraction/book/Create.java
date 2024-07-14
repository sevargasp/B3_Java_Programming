package day37_a_abstraction.book;

public interface Create {

    // if something is final, it has to be given value
    // variables in interaces are "static final" - constants
    String NAME = "Test";// public static final String NAME = "Test";
//int a =100;// static and final
    public abstract void read(); // abstract method --- public abstract void read();

    void write(); //abstract method --- any methods made in the interface with no access modifiers are public abstract


}
/*
* si yo declaro una variable final debo de inicializarla porque no se puede modificar.
* LAS variables en interfaces son "Static final"-constants, NO debo declararlas pero mi intellij entiende que es public Static Final.
*yo puedo usar abdstraccion solo de 2 maneras con abstract class or con uso de las interfaces
* si creo un metodo void read(); NO ES DEFAULT EN INTERFACES, ESO SOLO SIGNIFICA QUE ES UN PUBLIC ABSTRACT. SI NO LE ESCRIBI NADA ADELANTE.(es decir que no tenga access modifiers.
*
* SOL0O PUEDE TENER PUBLIC ACCESS MODIFIERS. LO MISMO QUE LOS METHODS, SE SABE POR OBVIEDAD QUE SON PUBLIC AND ABSTRACT.TODOs LO DESCRITO EN INTERFACE ES PUBLICO,
*
* */







