package day19_nested_loops;
/*
        Go through a whole month, by looping through each week and each day
         */
public class Month {
    public static void main(String[] args) {
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week: "+ week);
            for (int day = 0; day <= 7; day++) {
                System.out.println("\tDay: "+day);

            }


        }
    }
}
