package day33_b_encapsulation.bank_account;

public class UseBankAccount {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        // System.out.println(obj.accountNumber); // direct access - not available
        // System.out.println(obj.routingNumber); // direct access - not available
        //Cuando se conviernten en privado, no puedo usarlos como lo tengo anteriormente.


        System.out.println(obj.getAccountNumber());

        obj.setRoutingNumber("123456789");
        System.out.println(obj.getRoutingNumber());

        obj.setAccountNumber("1234");//no correct digits account.
        System.out.println(obj.getAccountNumber());

        //obj.accountNumber = "123456789";
//siempre que vea private, debo accederles desde diferente class con setters and getters.
        //setters es para writing
    }
}