package day30_b_custom_classes;

public class App {
    // INSTANCE VARIABLES / DATA MEMBERS
    // These are not in a method. They are directly in the Class level
    // NOTE: if variables are declared in Methods, they are called LOCAL VARIABLES
    String name = "rrr";
    double version;
    boolean isFree;


    // This method is INSTANCE METHOD - does not have "static" keyword
    // Each object will run its own version.
    // Since .run() method is INSTANCE method, we cannot call by class name. We MUST call by object/object reference.
    public void run() {
        System.out.println(name + " is running.");
    }

    public void update () {
        System.out.println(name + " is updating...");
        version += 1.1;
    }





}