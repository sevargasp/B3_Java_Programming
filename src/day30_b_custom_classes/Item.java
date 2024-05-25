package day30_b_custom_classes;

public class Item {

    // INSTANCE VARIABLES
    String name;
    double price;


    // This is SPECIAL METHOD.
    // HELPS TO PRINT / GET INTO FOR OBJECT DIRECTLY.
    @Override // If you want, you can remove this "Override" text
    public String toString() {
        return "Item: " +
                "\n\tprice: " + price +
                "\n\tname: " + name ;
    }


}