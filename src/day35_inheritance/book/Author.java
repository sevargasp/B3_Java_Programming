package day35_inheritance.book;

import my_utilities.StringUtil;

public class Author {
//here im encapsulating just for this class
    private String name;
    private int age;
    private String nationality;

//como cree el constructor de esa clase, cuando sea que estoy creando el objeto debo de llamarlo con esos elementos.
    public Author(String name, int age) {
        //this.name = name;
        setName(name);//llama al set metodo
        //this.age = age;
        setAge(age);
    }


    public String getName() {
        return name;
    }
//for the next set name, tomara el nombre desde el main metodo y lo ajustara
    public void setName(String name) {//lo que sea que el usuario me de, quiero es modificarlo y dejarlo "Jojo Moyes"
        String result = "";//container para almacenarlo.
        for (String each : name.split(" ")){//hizo un split al name para usarlo como array y poderlo pasar al foreach.
            result += StringUtil.fixFormat(each) + " ";
        }
        // result = "Jojo_Moyes_"
        this.name = result.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //this.age = age;
        if (age > 10){
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}