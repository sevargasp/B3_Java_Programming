package day31_custom_classes;

public class ThisKeyword {


    // instance variable
    int a = 100;

    //                  local variable
    public ThisKeyword (int a) {
        a = a; //
        // how can I make a difference between LOCAL and INSTANCE variable if they have SAME names
        System.out.println(a); // this is LOCAL variable -- > a
        System.out.println(this.a); // this is INSTANCE variable -- > a
        this.a = 400;
    }

}