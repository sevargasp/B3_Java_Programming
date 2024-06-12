package day36_inheritance.access.b;
// Different package - Different class
import day36_inheritance.access.a.First;

public class Third {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println( obj.one );// since one has public access modifier, can access from anywhere in project
        //System.out.println( obj.two ); // since two has protected access modifer and since there is no IS-A relation between Third class and First class and SInce these two classes are in different packaged, we CANNOT have access
        //System.out.println( obj.three ); // since three has default access modifier, can access from anywhere in the same package. In here since it is a different package we cannot access
        //System.out.println( obj.four ); // since four has private access modifier, can access from ONLY SAME CLASS

        Third obj2 = new Third();
        //Since there is no relation between the class (First) which has members called one, two, three, four, we can not access
        //Since Third class has no members called one, two, three, four, we can not access
        //obj2.one;
        //obj2.two;
        //obj2.three;
        //obj2.four;

    }
}