package day33_b_encapsulation.traffic;

public class TrafficLight {

    private String color;//i did encapsulation to protect my variables

    public TrafficLight (String color) {
        setColor(color);//constructor.
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()){
            case "yellow":
            case "red":
            case "green":
                this.color = color;
                //esto lo hice para restringir las posibilidades.
        }
    }
}