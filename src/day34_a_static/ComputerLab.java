package day34_a_static;

//1.1
public class ComputerLab {
    public static void main(String[] args) {
        Computer comp1 = new Computer(500.00, "HP", "Silver");//este es mi objeto y desde qui mismo puedo adicionar las cosas, para no hacerlo 1 a 1.

        Computer.hasBattery = false;

        System.out.println(Computer.hasBattery);//false, porque lo reasignaria
        Computer comp2 = new Computer(400.00, "Dell", "Black");

        System.out.println(comp1.hasBattery);//se puede PERO NO ES LO ADECUADO.

        comp2.hasBattery = true;//SI LO REASIGNO, SE REASSIGNA PARA TODOSS.PORQUE ES UNA COPIA UNICA DE TODOS.

        System.out.println(comp2.hasBattery);

        System.out.println(comp1.hasBattery);
    }
}
