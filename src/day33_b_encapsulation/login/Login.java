package day33_b_encapsulation.login;

public class Login {

    private String username;
    private String password;
//     String username;estas serian acces modifiers by default
//    String password;estas serian acces modifiers by default

    public Login (String username, String password){//this is a constructor
        this.username = username;
        //this.password = password;esto es para que no todas puedan tenerlo.
        setPassword(password);//llamo a otro metodo para poderlo usar indirectamente.
    }


    public void setPassword (String password){//this is an instance method
        if(password.length() >= 8 && password.contains("!") ) {
            this.password = password;
        }
    }



//    public String getPassword () {//esto es para obtener el password directamente.
//        return password;
//    }

    public String getPassword (String username) {//this ins an instance return type String method
        if (username.equals(this.username)){
            return password;
        }
        return "WRONG USERNAME";
    }







}