package day37_a_abstraction.book;

public class Book implements Create {

    @Override
    public void read() {
        System.out.println("Reading the book");
    }

    @Override
    public void write() {
        System.out.println("Writing the book");
    }
}
/*
1 clase puede tener solo un padre heredada.

pero para una interafce no puedo heredarla, le hago implements.
click derecho---> implement override or method.
si tengo dos metodos en mi iinterface, debo de implementarlos obligatoriamente en mi "hija"


 */
