package day38_a_abstraction_interface.shopping;
/*
Create a concrete class Amazon
    - Make the class final
    - Inherit OnlineShopping and implement all abstract methods

 */
public final class Amazon extends OnlineShopping {
    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Cart");
    }

    @Override
    public void payForShipping(boolean hasPrime) {
        System.out.println(hasPrime ? "No cost for shipping" : "Paying for shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon Drop Location");
    }
}


// Amazon IS-A OnlineShopping
// Amazon IS-A Shopping
// Amazon IS-A Shipping
/*
*
*the clase a clase uso extends
*
*
*
*
* */