package day35_inheritance.computer;

public class Computer {

    String os;
    int memory;
//una vez que llamo al constructor, deja de ser default, por eso debo usar el super para poder llamarlo.
    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

//    public Computer(){
//
//    }


}
//si mi padre tiene constructor, pero mis hijos no, fallara el programa.
//yo puedo tener constructor en los hijos y no en el padre.
/* SI YO TENGO MY DEFAULT CONSTRUCTOR, NO NECESITO ANADIRLE EN LOS CHILDREN EL SUPER(). PERO SI YA DEJE DE TENER EL DEFAULT CONSTRUCTOR, DEBO LLAMARLO EXPLICITAMENTE  EN LOS HIJOS, COMO SE HACIA CON EL THIS(), PERO ESTA VEZ, REFERENCIANDO LAS PALABRAS DEL PAPA*/