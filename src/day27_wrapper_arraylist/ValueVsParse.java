package day27_wrapper_arraylist;

public class ValueVsParse   {
    public static void main(String[] args) {

        String s = "30";

        int num1 = Integer.parseInt(s); // converting String "30" into an int 30 [primitive]
        Integer num2 = Integer.valueOf(s); // converting String "30" into an Integer 30 [Wrapper Class / non-primitive / object type]

        int num3 = Integer.valueOf(s);
        /*
            Integer.valueOf(s); --- >  converts String "30" into Integer Object 30 (Integer Wrapper Class Object)
            int num3 = --- >  I am trying to store the value into a primitive variable

            primitive = object type  [UNBOXING]
         */


        /*
            int a = 4;
            byte b = (byte)a;  // Narrowing casting
            System.out.println(a);
            System.out.println(b);
         */


        Integer num4 = Integer.parseInt(s);
        /*
            Integer.parseInt(s); --- > converting String "30" into primitive data type [int]
            Integer num4 = --- > I am trying to store the value an Integer type (Wrapper Class Object)

            object type = primitive [AUTO BOXING]

         */


    }

}