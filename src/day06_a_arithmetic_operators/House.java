package day06_a_arithmetic_operators;
/*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */
public class House {
    public static void main(String[]args)   {
        String houseType="Penthouse";
        int numOfBedrooms= 4;
        int numbOfBathrooms=3;
        int numOfKitchen= 2;
        boolean isThereAnyBasement=false;
        boolean hasAttic=true;
        boolean hasPool=true;
        boolean isOnSale=false;
        double costOfHouse= 999_999.99;
        String fullAddress= "12345 Test St";
        int zipCode=54321;
        boolean hasPark=true;
        double ratingOfSurroundingSchool= 4.9;

        String houseInfo="The"+houseType+" on " + fullAddress+", "+ zipCode+"costs $"+
        costOfHouse+"The"+houseType+"has the attic: "+hasAttic+ ", has a pool:" +hasPool+" is on sale:"+isOnSale+", has a parl"
        +hasPark+". The schools in the area have a rating of "  +   ratingOfSurroundingSchool;
        System.out.println(houseInfo);


    }

}
