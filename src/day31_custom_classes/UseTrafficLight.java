package day31_custom_classes;

public class UseTrafficLight {
    public static void main(String[] args) {

//        TrafficLight obj1 = new TrafficLight();
//        System.out.println(obj1.color);

//        obj1.color = "Green";
//        System.out.println(obj1.color);

//                              TrafficLight (String startColor)
        TrafficLight obj1 = new TrafficLight("Yellow");
        System.out.println(obj1.color);

        obj1.color = "Red";
        System.out.println(obj1.color);


        TrafficLight obj2 = new TrafficLight("Green");
        System.out.println(obj2.color);



    }
}