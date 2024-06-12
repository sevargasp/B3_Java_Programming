package day30_b_custom_classes;

import my_utilities.StringUtil;

public class UsingApp {

    public static void main(String[] args) {

        // System.out.println(name); // NOT VALID

        // How to create object of Class
        App app1 = new App();
        // app1, has its own version/copies of name, version and isFree

        App app2 = new App();
        // app2, has its own version/copies of name, version and isFree

        app1.name = "loopcamp";
        app1.version = 2.0;
        app1.isFree = false;

        System.out.println(app1.version);

        // App.run(); // Since .run() method is INSTANCE method, we cannot call by class name
        // App.update();

        app1.run();
        app1.update();



        app2.name = "game";
        app2.version = 1.4;
        app2.isFree = true;


        System.out.println("--------------");
        app2.run();
        app2.update();


        System.out.println("---------------");
        System.out.println(app1.version); //
        System.out.println(app2.version); //


        System.out.println("---------------");
        app1.update();

        System.out.println(app1.version);
        System.out.println(app2.version);





        System.out.println("---------------");
        new App().run(); // I created a new Object with no reference

        new App().name = "Racecar";
        System.out.println(new App().name); // This one is completely new object











    }
}