package day11_statements;

public class NestedExample {
    public static void main(String[] args) {
        boolean a= true;
        boolean b = false;
        boolean c = false;
        boolean d= false;
        if(a) {
            System.out.println(1);

            if (b) { /*----------------NESTED IF STATEMENT */
                System.out.println(3);}
            if(d){
                System.out.println(5);
                } else{
                System.out.println(6);
            }}
        else { System.out.println(2);}

           if (c) {
                System.out.println(4);
                    //for instance if I print out (c) it will not run because (a) is true, and (c) is contained in else.
                }
            }
        }


