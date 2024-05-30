package day31_custom_classes;

public class Phone {

    String name;
    String brand;
    int memory;
    double version;


    public Phone (String name){ // name = "Iphone X";
        this.name = name; // phone1.name = name;// si yo no tengo este this, al reasignarlo se reasigna asi misma como variable vacia, entonces cuando se llame estara vacia. por eso se pone el this.
        //mejor dicho es como si tuviese name=inputName;--->solo que se cambia para this.name=name, ahora si coge las variables del otro lado.
    }



    public Phone (String name, String brand, int memory, double version){ // name = "Iphone X";
        this.name = name; // phone1.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    public Phone (String name, String brand){ // name = "Iphone X";
        this.name = name; // phone1.name = name;
        this.brand = brand;
    }




    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                ", version=" + version +
                '}';
    }
}