package day33_b_encapsulation.login;

public class UseLogin {

    public static void main(String[] args) {
//esto es un objeto creado by keyword.
        Login person1 = new Login("loopcamp", "loopAcademy1234!");



        // Since those INSTANCE VARIABLE are "private", I cannot access them directly.
        //System.out.println(person1.username);
        //System.out.println(person1.password); // direct acces is impossible because of the access modifier.



        System.out.println(person1.getPassword("loopcamp" )); // indirect--para poder obtenerlo tengo que llamar a un metodo public, y ese metodo que estoy llamando que es publico esta en la misma clase de las variables privadas.
        person1.setPassword("loop!camp");
        System.out.println(person1.getPassword("loopcamp" ));





    }

}