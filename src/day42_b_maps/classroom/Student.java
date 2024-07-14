package day42_b_maps.classroom;

public class Student {

    String name;
    double age;
    int id;


    public Student (String name, double age, int id) {
        this.name = name;//para mis variables instanciadas, si no la tengo me lleva a las locales.
        this.age = age;
        this.id = id;
    }


    @Override
    public String toString(){//este metodo viene de Object class
        //lo que sea que yo implemente estoy implementando.

        return "\nStudent Info: " +
                "\n\tName: " + name +
                "\n\tAge: " + age +
                "\n\tID: " + id;

    }

}