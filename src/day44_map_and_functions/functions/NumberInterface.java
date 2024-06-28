package day44_map_and_functions.functions;

@FunctionalInterface
public interface NumberInterface {
    void apply(int n);
}




// The below is to explain the different of interface and functional interface
//-------------------------------------------------
interface NumInt {
    void apply(int n);
}

class A implements NumInt {
    public void apply(int n) {
        if(n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }



}

class B implements NumInt {
    public void apply(int n) {
        System.out.println(n * n * n);
    }
}