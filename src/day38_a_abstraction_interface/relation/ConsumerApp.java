package day38_a_abstraction_interface.relation;
import day38_a_abstraction_interface.shopping.Shipping;

//Going from interface to interface is INHERITANCE, and we use "extends" keyword
//Since these are interface, they do not follow the same rules as classes. So, we can extend multiple interfaces

//We are passing the method from AllowUserToSell and Shipping interfaces to ConsumerApp interface
public interface ConsumerApp extends AllowUserToSell, Shipping {

}

// class - class ---------- > extends
// class - interface ------ > implements
// interface - interface -- > extends



abstract class TestA implements Shipping, AllowUserToSell {

}
/*
 *
 *
 *Interface to interface ,it works similar to the class to class, i have to extend.
 *
 *
 * yo puedo tener multiples interfaces, no necesariamente uno, y los llamo con extends el primero, y despues uso coma.
 * */