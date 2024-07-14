package day39_a_polymorphism.car;

public class Car {
}

class BMW extends Car {
}

class Tesla extends Car {
}

class Toyota extends Car {
}

class Camry extends Toyota {
}

class LandRover extends Car {
}


class Ford {
}


class DealerShip {
    public static void lease(Car car) {//al ser un metodo car, puedes enviar aqui landRover, bmw, tesla, toyota, camry files, porque son hijas de car.
        System.out.println("Leasing a car: " + car.getClass().getName());
    }
    // .getClass -- > coming from Object class
    // Since Object is the parent of all classes, all accessible thing inherited into child classes.


    public static Car getCar(int option) {
        if (option == 1) {
            return new Toyota();
        } else if (option == 2) {
            return new Tesla();
        } //else if (option == 3) {
        //return new Ford();// No IS-A relation
        else {
            return new Car();
        }
    }

}


class LocationA extends DealerShip {
//return COVARIANT
    public static Camry getCar(int option) {
        if (option == 1) {
            return (Camry) new Toyota();//en el metodo se puede retornar la clase que se dice que dara o alguno de los hijos, no se puede retornar al padre
        } //else if (option == 2) {
        // return new Tesla();
        //} //else if (option == 3) {
        //return new Ford();// No IS-A relation
        else {
            return new Camry();
        }
    }
}
//  public static TOYOTA getCar(int option) {
//        if (option == 1) {
//            return  new Toyota();//
//        } //else if (option == 2) {
//        // return new Tesla();
//        //} //else if (option == 3) {
//        //return new Ford();// No IS-A relation
//        else {
//            return new Camry();//aqui podr[ia usar a retornar toyota porque es una extension de toyota
//        }

class Runner {
    public static void main(String[] args) {

        Car car = new Car();
        DealerShip.lease(car);


        Tesla tesla = new Tesla();
        DealerShip.lease(tesla);

        DealerShip.lease(new LandRover());

        DealerShip.lease(new Toyota());

        System.out.println("--------------------");


        Car car2 = DealerShip.getCar(1);    // Car = new Toyota();
        Car car3 = DealerShip.getCar(2);    // Car = new Tesla();
    // Toyota t= DealerShip.getCar(1);         // toyota = new toyota, y no puedo hacerlo, debo hacerle       casting.//porque car es mas grande que toyota
        Toyota t = (Toyota) DealerShip.getCar(1);    // Car = new Toyota();


    }
}