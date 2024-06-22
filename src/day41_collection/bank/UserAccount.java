package day41_collection.bank;

public class UserAccount {
    public static void main(String[] args) {
        Bank account1 = new Bank();
        account1.balance = 1_000;//instance variable y cada object tiene su instancia

        try{
            account1.withdraw(600);
            System.out.println(account1.balance); //400

            account1.withdraw(500);
            System.out.println(account1.balance); //-100
        } catch (NotEnoughBalanceException e){//aqui debo dolocar lo que tenga de throws o en su defecto
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        System.out.println(account1.balance);
        System.out.println("Continue...");
//        account1.login("loopcamp", "Test123@");//si lo llamo solo asi sin el try catch de abajo, me da error porque no lo he manejado.
        try {//primero handle compile exception. y si tambien es runtime exception haga algo.
            account1.login("loopcamp", "Test123@");
        } catch (InvalidCredentialException e){//con este estoy manejando exception y runtime.
            System.out.println(e.getMessage());
        }

        System.out.println("DONE");




    }
}
//calling the default constractor. and it has access to 1  instance variable and 2 instance methods
//cada referencia tiene su copia de la instancia.
//el balance por la account1, sera siempre por la misma, si cro otro objeto se crea un nuevo espacio en la memoria solo para ese.
//retiro 500 y me daria negativo, por eso creo condicion en el metodo withdraw


//cuando llamo al alogin inicialemente, porque tengo compile exception, debo ser muy cuidadoso con ese metodo.

//ahora bien, llamando a mi metodoexception personalizado