package day40_exception.learn_exc;

public class SecondTry2 {
    public static void main(String[] args) {

        try{

            String s = null;
            //String s = "loop";
            System.out.println(s.length());

            int [] a = {1,2,3,4,5};
            System.out.println(a[0]);

        }catch (RuntimeException e){
            System.out.println("Either Null Pointer Exception or Array Index Out Of Bound Exception is caught");

        }

        System.out.println("Done");


    }
}