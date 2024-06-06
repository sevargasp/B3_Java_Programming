package day34_b_encapsulation;
/*
    create a class called Square
    - data:
        side
*/
/*
    - constructor

        - create a constructor that creates a Square object with the side

            call setter here

    - encapsulate the Square class

        - setter condition: side must be a positive number otherwise it will not be assigned to the instance variable

*/
/*
    - other methods methods:

        - calculateArea()
            calculate and return the area of a Square

        - calculatePerimeter()
            calculate and return the perimeter of a Square

        - toString()
            print the side, area, and perimeter of the Square object

    Create a separate class to create and test the Square objects

 */
public class Square {

    //Instance Variable
    private int side;



    public Square (int side) {
        setSide(side);
    }


    public int getSide () {
        return side;
    }


    public void setSide(int side) {
        if (side > 0){
            this.side = side;
        }
    }


    public int calculateArea () {
        return side * side;
    }


    public int calculatePerimeter (){
        return side * 4;
    }

    public String toString(){
        String info = "Square Info - Side: " + side + " | Area: " + calculateArea() +  " | Perimeter: " + calculatePerimeter();
        return info;
    }


}
