package day33_a_static;

import day32_custom_classes.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
//cuando creo este offer importó la clase del 32, porque el objeto pertenece a esa clase.
        Offer first = new Offer("Texas", "Google", 125_000, true, 15);
        System.out.println(first);

        ArrayList <Offer> offerList = new ArrayList<>(); // created an ArrayList that will hold  Offer objects
        offerList.add(first);  // added the first object of Offer in to ArrayList of Offer

        offerList.add( new Offer("New York", "Amazon", 130_000.00, true, 15) ); // addded another object into ArrayList of Offer directly. whitout any container variable


        System.out.println("-------------------------");
        System.out.println(offerList);

        System.out.println("-------------------------");
       //el siguiente es un array de tipo offer.
        Offer [] moreOffers = {
                new Offer( "Chicago", "Apple", 140_000, false, 10),
                new Offer( "Texas", "Tesla", 150_000, false, 20),
                new Offer( "Florida", "Facebook", 160_000, true, 10)
        };

        System.out.println(Arrays.toString(moreOffers));


        System.out.println("-------------------------");
        offerList.addAll(Arrays.asList(moreOffers));//con esto anado todos los elementos de una sola vez a mi arrayList
        System.out.println(offerList);


        System.out.println("-------------------------");
        // Can you store offers which is equal or more than 130_000 into another ArrayList
        ArrayList <Offer> salaryMoreList = new ArrayList<>(offerList);
        salaryMoreList.removeIf(eachOffer -> eachOffer.salary < 130000 );
        System.out.println("List of Offers with more salaries");
        System.out.println(salaryMoreList);


        System.out.println("-------------------------");
        // Can you find the Full Time offers
        ArrayList <Offer> fullTimeList = new ArrayList<>(offerList);
        fullTimeList.removeIf( each -> !each.isFullTime);
        System.out.println("List of Offers with Full Time:");
        System.out.println(fullTimeList);
//tomo isFulltime de Offer class. y hay otra variable que cogio, por eso modifico y las volvio publicas. de lo contrario no me dejar[ia usarlas.








    }
}
// yo puedo si se donde se encuentra dar un get() y asignarlo a una variable.
//    !each.isFullTime false}
