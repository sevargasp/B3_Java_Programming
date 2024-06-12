package day31_custom_classes;

public class useCarpet {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(true, 8.5, 12, 2.5);
        //carpet1.calculatePrice();esto lo realizo para llamarlo porque cuando imprimia el de abajo sin haber lalmado este el precio total quedaba vacio.

        carpet1.length  = 14;
        // We had to call teh .calculatePrice() method again because that method was called in constructor. Since, we have updated the length, I am calling .calculateMethod() to get updated totalPrice.//
        carpet1.calculatePrice();//puedo ahcer debug antes de este para poder darme cuenta que el valor no se actualizaria si no lo llamo, PERO DEBBO HACERLO EN COMMENT.

        System.out.println(carpet1);






    }

}