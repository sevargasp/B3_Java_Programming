package day08_scanner_logical_operator;

public class AllOperators {public static void main(String[]args){
    System.out.println(5+2*3);//arithmetic operators
    System.out.println(5*2+4/2  );
    System.out.println(5+2>4-3);
    //                  7 >4-3
    //                  7>1


    int a =20;
    int b= -a-- + a++ + --a * a--;
    //      -20  +19  +  19 * 19
    //      -20  +19   + 361
    //      360
    System.out.println(19*19);

}
}
