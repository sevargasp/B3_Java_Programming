package day36_inheritance.shapes;

public class AllShapes {
    public static void main(String[] args) {

        Circle obj1 = new Circle(4.5);
        System.out.println(obj1.area());
        System.out.println(obj1);

        System.out.println();

        Square obj2 = new Square(6);
        System.out.println(obj2.area());
        System.out.println(obj2);


//un metodo overriding es que estan en diferentes paquetes, pero los argumentos y el tipo de retorno es exactamente igual.


    }
}