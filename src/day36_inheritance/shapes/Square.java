package day36_inheritance.shapes;

public class Square extends Shape {
    double side;

    public Square (double side){
        super("Square");
        this.side = side;
    }


    @Override
    public double area (){
        return side * side;
    }

    @Override
    public double perimeter(){
        return side * 4;
    }


    @Override
    public String toString(){
        return "Info about " + name + ": \nArea: " + area() + "\nPerimeter: " + perimeter() + "\nSide: " + side;
    }



}
//metodo overloading, solo puede pasar en la misma clase .
//para override, debe ser exactamente
//si llamo al override y no pone problemas quiere decir que lo implemente adecuadamente.