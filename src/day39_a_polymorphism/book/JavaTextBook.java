package day39_a_polymorphism.book;

public class JavaTextBook  extends  EBook {

    boolean isFun;

    @Override
    public void open() {
        System.out.println("Opening java text book");
    }

    @Override
    public void read() {
        System.out.println("Reading java text book");
    }

    @Override
    public void download() {
        System.out.println("Downloading java text book");
    }
}
/*
 *
 *
 *
 * */