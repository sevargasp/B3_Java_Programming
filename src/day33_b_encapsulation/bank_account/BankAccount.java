package day33_b_encapsulation.bank_account;

public class BankAccount {
    // By making these private, I am restricting DIRECT access to them.
    // Or, I hide them from direct access
    //    String accountNumber;default access modifier, instance variables. puedes tener acceso directo.
    //   String routingNumber;default access modifier, instance variables. puedes tener acceso directo.
    private String accountNumber;
    private String routingNumber;
//click derecho, generate---> setters and getters(inside to the class)
    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) //normalmente el return type  of setter es void// y por defecto del generate se asigna una variable this, porque es para que se pueda agregar statemnts,condiciones.
     {
        if (routingNumber.length() == 9) {
            this.routingNumber = routingNumber;//esto es para asignarles valores.
        } else {
            System.out.println("Not correct digits count");
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() >= 12 && accountNumber.length() <= 17){
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Not correct digits count");
        }
    }
}