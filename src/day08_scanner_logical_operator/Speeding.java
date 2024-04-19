package day08_scanner_logical_operator;
/*
    create a class called Speeding, and write a program to determine if the car is speeding

            declare 3 variables:
            current speed, speed limit, speeding boolean

            print
            "Are you speeding? " true/false
 */
public class Speeding {public static void main(String[]args){
    int currentSpeed=26 ;
    int speedLimit= 25;
    //lets say you can go 3 mile more than what is allowed
    boolean isSpeeding=currentSpeed > speedLimit+3;//because it is over normal rule
    System.out.println("Are you speeding "+isSpeeding);

}
}
