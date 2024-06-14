package day38_a_abstraction_interface.shopping;
/*
Create an interface Shipping
    - Declare an abstract methods:
        payForShipping(boolean)
 */
public interface Shipping {

    String COUNTRY = "US"; // public static final

    void payForShipping(boolean hasPrime);

}
/*
*lo mismo para las variables, serian public abstracts, si no tengo ningun tipo de access modifiers.
*
* CADA VEZ QUE TENGA UNA VARIABLE DEBO INICIALIZARLA PORQUE SIMEPRE EN INTERFACE SON PUBLIC STATIC FINAL.
*
*
 */