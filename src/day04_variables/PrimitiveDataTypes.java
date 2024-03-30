package day04_variables;
/*
    Data types:
        Primitive - total 8
            integer types:byte short int long
            floating types: float-double
            character: char
            true/false: boolean

*
* */
public class PrimitiveDataTypes {
    public static void main(String []args){
        System.out.println(5);//this iis called statement

        byte age= 60;
        System.out.println("age");//60 or age
        System.out.println(age);//datatype here is byte
        System.out.println(60);//in here the datatype by default is "int"

        short year; // i declared a variable called year.
        year=2024; // I assigned a value, 2024, into my variable called year.
        System.out.println(year); //datatype here is short
        System.out.println(2024); //datatype here is :int by default.


        int addressNumber=244432; //I declared a variable and assigned a value into that variable.
        System.out.println(addressNumber);//datatype here is: int
        System.out.println(244432); //by default datatype here is int


        long bigNumber=957665487874652641L;//I must write L to the end lowercase or uppercase but
        // people prefer upper to see the difference
    }
}
