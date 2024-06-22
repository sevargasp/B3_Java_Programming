package day41_collection.bank;

public class Bank {
    double balance;

    // withdraw
    public void withdraw(double amountToTakeOut){//esto es runtime exception.
        if (amountToTakeOut > balance){
            throw new NotEnoughBalanceException ("Balance only has: " + balance);//tenia previamente para ocasionar un Runtime exception. pero puedo crear mi propia excepcion.
        }
        balance -= amountToTakeOut;//aqui estoy retirando dinero de mi cuenta y se esta actualizando
    }




    // login                                            //debo de colocar esto porque una vez y tengo en el if statement el throw debo de evitarlo por ahora.
    public void login (String username, String password) throws InvalidCredentialException {//esto es compile exception.
        if (!username.equals("loopcamp" )){
            //System.out.println("Not valid username");
            throw new InvalidCredentialException("Invalid username");//tengo 2 if statements por separador porque se tienen cosas diferentes, si no me funciona el usuario no me va a llegar al del password, y una vez que se alcanza un throw new InvalidCredentialException llama al metodo, el cual tiene entrelazado a exception porque es un child de el, entonces ese llama a su vez al constructor con un Solo String para entregar un mensaje.
            //una vez que se aacaba este flujo vuelve a la corredora
        }//porque despues de la excepcion nada corre A NO SER QUE LO TENGA EN CATCH. 
        if (!password.equals("Test123@")){
            //System.out.println("Not valid password");
            throw new InvalidCredentialException ("Invalid password");
        }
    }
}
//instance variables
//shorotcutoperator.
//withdraw, I implement an exception, because I can not have negative values in my balance, ONLY POSITIVE BALANCE.
//this is unchecked exception.
//creo un metodo para el login,  que acepta 2 elementos String.. y en este metodo si los dos son Exception, los dos serian para compile extection, entonces le tiene que add el throws
//mientras no use el throws y este manejando el compile sera rojo y al final debo ponerlo