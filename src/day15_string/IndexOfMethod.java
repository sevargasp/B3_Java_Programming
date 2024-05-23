package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s= "kojnsaduifbsaipdfbpen";

        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf('p'));
        System.out.println(s.indexOf("pe"));
        System.out.println("------------------");

        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));
        System.out.println("-----");
        System.out.println(s.indexOf('x'));
        System.out.println(s.indexOf("x"));
        System.out.println(s.indexOf("pem"));
        System.out.println(s.indexOf("PEN"));


        System.out.println("-----");
        System.out.println( s.indexOf('p', 4) );
        System.out.println(s.indexOf("pe", 1));

        System.out.println(s.indexOf("pe", 10)); // This will not give EXCEPTION, it wil just say that there is not MATCHING with -1


        System.out.println(s.indexOf("pn"));

    }
}
