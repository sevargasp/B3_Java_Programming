package day30_b_custom_classes;

    /*

    Create a coffee class with these instance variables:
         price, size(oz), brand, types

         ex types: black, cappuccino, latte, mocchiato....

    instance methods:

        - make a toString to print all the information of the coffee objects

        - drink(): print: drinking $type of coffee

        - refill(amount in oz): print refilling x oz
            add the number of oz to the total size

     */


public class Coffee {
    double price;
    double size;
    String brand;
    String type;

    @Override
    public String toString() {
        return "Coffee:" +
                "\n\tprice: $" + price +
                "\n\tsize: " + size +
                "\n\tbrand: " + brand +
                "\n\type: " + type;
    }

    public void drink () {
        System.out.println("Drinking " + type + " of coffee.");
    }


    public void refill (double num) {
        System.out.println("Refilling " + num + " oz");
        size += num;
    }


}
