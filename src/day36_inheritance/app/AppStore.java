package day36_inheritance.app;

public class AppStore {
    public static void main(String[] args) {
        Instagram obj1 = new Instagram(4.5);
        System.out.println(obj1.name);
        System.out.println(obj1.version);
        obj1.download();
        obj1.postPicture();


        System.out.println();
        YouTube obj2 = new YouTube(5);
        System.out.println(obj2.name);
        System.out.println(obj2.version);
        obj2.download();
        //obj2.postPicture();
        obj2.watchVideo();


    }
}
