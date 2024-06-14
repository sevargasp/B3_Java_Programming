package day38_a_abstraction_interface.interface_methods;

public class MacbookPro implements Mac{

    @Override
    public void turnOn(){
        System.out.println("Macbook Pro is turning on....");
    }

}


class Runner {
    public static void main(String[] args) {


        //System.out.println(MacbookPro.NAME); // Still Good - You can use Child class name to reach static variables inherited from parent interface
        //System.out.println(MacbookPro.OS); // Still Good - You can use Child class name to reach static variables inherited from parent interface

        System.out.println(Mac.NAME); // Better to call with interface name
        System.out.println(Mac.OS); // Better to call with interface name



        Mac.company();
        //Mac.faceTime(); //default method needs to be called from object
        //Mac.turnOn(); // not valid. Since in Mac interface, there is no implementation of turnOn() method, cannot call it


        MacbookPro obj = new MacbookPro();
        obj.turnOn();
        obj.faceTime();
        //obj.company();  //static methods from INTERFACE, are not inherited, so they cannot be accessed from objects. only by interface can be accessed


    }
}

/*
*
* la mejor manera de alcanzar las variables del interface es mediante--lamar al interface. (y el nombre de la variable) es buena practica, SIN EMBARGO, tambien lo puedes hacer mediante la clase a la que esta perteneciendo.
*
*
* los estaticos se pueden acceder mediante el interface name o class name.
*
* cosa diferente a los metodos default que estan en interface, que se tiee que acceder a ellos mediante el objeto.
* entonces en este caso, se llegaria por MacbookPro.
*
*TODOS LOS ESTATICOS DEBEN LLAMARSE POR LA CLASE.
*
* PARA LOS DEFAULT DESDE INTERFACE SE ACCEDE POR OBJETO, DESDE LOS ESTATICOS DESDE EL NOMBRE DE LA INTERFACE.
*
* */