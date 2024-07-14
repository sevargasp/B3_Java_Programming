package day23_multidimensional_arrays;

// Printout this format for each zone
// $app is deploying on $zone

public class AWS {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        String[] allZones = zones.split(",");

        for (String each : allZones) {
            System.out.println(app + " is deploying on " + each);
        }

        System.out.println();

        // We did this just to practice the fori loop. It is doing exact same thing as above
        for (int i = 0; i < allZones.length; i++) {
            System.out.println(app + " is deploying on " + allZones[i]);
        }


    }
}