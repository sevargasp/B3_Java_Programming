package day39_a_polymorphism.cloth;

public class Store {
    public static void main(String[] args) {

        // ALL possible references of TShirt
        // #1 - ITSELF
        TShirt t1 = new TShirt();
        t1.wear();


        // #2 - PARENT CLASS
        Clothes t2 = new TShirt();
        t2.wear();

        System.out.println("------------------");

        // ALL possible references of Jacket
        // #1 - ITSELF
        Jacket j1 = new Jacket();
        j1.wear();
        j1.putOnHood();


        // #2 - PARENT CLASS
        Clothes j2 = new Jacket();
        j2.wear();
        //j2.putOnWood(); //Cloths reference does not have access to putOnHood();

        // #2 - INTERFACE
        HasHood j3 = new Jacket();
        //j3.wear(); //HasHood reference does not have access to wear();
        j3.putOnHood();


        // #3 - Object
        Object j4 = new Jacket();
        //j4.wear(); // Object reference does not have access to wear();
        //j4.putOnHood(); // Object reference does not have access to putOnHood();


        System.out.println("------------------");

        TShirt ts = new TShirt();
        // References Itself - > TShirt ts = new TShirt();
        // References Parent - > Clothes ts = new TShirt();
        //ts.wear();
        Jacket jt = new Jacket();
        // References Itself - > Jacket ts = new Jacket();
        // References Parent - > Clothes ts = new Jacket();
        // References Interface - > HasHood ts = new Jacket();
        buy(ts); //buy( new TShirt() );
        buy(jt); // buy( new Jacket() );
        buy(new TShirt());
        buy(new Jacket());



        HasHood jj3 = new Jacket();
        buy( (Jacket)jj3) ; //  HasHood jj3 = new Jacket(); -- > Jacket jj3 = new Jacket();
        //buy( (jj3) ); //  HasHood jj3 = new Jacket(); -- > Clothes close cannot accept HasHood jj3



    }

    public static void buy (Clothes clothes){ // Clothes clothes = new TShirt();

        if(clothes instanceof TShirt) {
            // Clothes clothes = new TShirt(); -- > new TShirt(); is instanceOf TShirt
            // Clothes clothes = new Jacket(); -- > new Jacket(); is instanceof TShirt
            System.out.println("Bought a TShirt");
        } else if (clothes instanceof Jacket){
            // Clothes clothes = new Jacket(); -- > new Jacket(); is instanceof Jacket
            System.out.println("Bought a Jacket");
        }

    }



}
/*
*
*
* hace upcasting si metodo el tipo de clase que es padre, para poder ingresar las mas bajitas. ejemplo de jacket y tshir, son hijas de clothes
* se puede crear directamente el objeto para madarlo alla al public static void buy(Clothes clothes)
*
* instance is the object. es para verificar si hay alguna relacion
*
*int a = 4;
* double b = a;
* Tshirt ts1= new Tshirt(); explicacion cerca de la hora 2.
* Clothes ts2= ts1;
* */