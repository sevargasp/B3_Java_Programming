package day35_inheritance.book;

public class Library {

    public static void main(String[] args) {

        Book obj1 = new Book();
        // obj1. - has access to 5 instance variables of the class


        AudioBook ab1 = new AudioBook();
        //ab1. - has access to 7 instance variable (5 from Parent + 2 from itself) and 1 instance method from itself
        ab1.duration = 100;
        ab1.narrator = "Morgan Freeman";
        ab1.listen();
        ab1.title = "Java is Fun";


        EBook eb1 = new EBook();
        //eb1. - has access to 7 instance variable (5 from Parent + 2 from itself) and 1 instance method from itself
        //eb1.duration = 100; //NOT REACHABLE
        eb1.size = 10;
        eb1.pages = 600;
        eb1.title = "Soft Skills";
        eb1.read();
        //eb1.listen(); // NOT REACHABLE-->invalid because .listen() belongs to a sibling class

        //here im creating an object of the author class
        Author a1 = new Author("jojo moyes", 40);//cuando cree mi objeto autor debo pasarle esa informaci[on.

        Book b1 = new Book();//que son las variables padre
        //b1. -  has access to 6 instance variables of the class
        b1.author = new Author("Gabriel Garcia Marquez", 80);
        System.out.println(b1.author);//without the toString i'll get a memory location.//la variable string  que le pertemece al author



        AudioBook audio1 = new AudioBook();
        audio1.author = new Author("Thomas Jefferson", 70);//i can do this because author is part of the parent class and audioBook is its child therefrore i also have access to those instance variables and instance methods.

        //how can i print only the name.
        System.out.println(audio1.author.getName());


    }


}
//puedo alcanzar las variables y los metodos, porque estan en el mismo paquete
