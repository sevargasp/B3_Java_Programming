package day08_scanner_logical_operator;

public class Store {
    //shorthand Operators it maybe x=y. x+=y--->x=x+y(we can also say x+=y+x

    public static void main (String[]args){

        String store= "Target";
        int numOfTv= 100;
        System.out.println("In the "+store+" store,there are "+numOfTv+" TVs.");
//        numOfTv=numOfTv-1; i can run to this form, other way is with post decrement or pre decrement, it goes to work aswell.
//        numOfTv-=1;

        System.out.println("Someone comes into store and purchased 1 TV");

        System.out.println("Now, in store we have "+--numOfTv+" TVs.");


        System.out.println("Now, in store we have "+--numOfTv+" TVs.");




    }
}
