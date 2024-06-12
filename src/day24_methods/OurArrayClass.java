package day24_methods;
/*

    all will accept array argument

    create a method that will print the first element
    create a method that will print the last element
    create a method that will print the element/s
        length matters -> if even there are two middle, for odd there is one middle

 */
public class OurArrayClass {


    public static void arrFirstElem (int [] arr ) {
        System.out.println("First Element: " + arr[0]);
    }

    public static void arrLastElem (int [] arr) {
        System.out.println("Last Element: " + arr[arr.length-1]);
    }


    public static void arrMidElems (int [] arr) {

        if (arr.length % 2 == 0) { // if length is EVEN
            System.out.println("Middle first: " + arr[arr.length/2-1]);
            System.out.println("Middle second: " + arr[arr.length/2]);
        } else {
            System.out.println("Middle: " + arr[arr.length/2]);
        }
    }

    public static void main(String[] args) {

        int [] numbers = {10, 2, 4, 765, 23, 0, 2344};
        int [] numbers2 = {1034, 23452, 234, 331, 2234, 0, 54};
        int [] numbers3 = new int[3]; // [0, 0, 0]

        int [] numbers4 = {1034, 23452, 234, 331, 2234, 0, 54}; // 7 - > 331 -- > 7/2 -- > 3
        int [] numbers5 = {1034, 23452, 234, 331, 2234, 0, 54, 65}; // 8 - > 331, 2234 --- > 8/2-1 --- > 3 , 8/2 --- > 4


        arrFirstElem(numbers);
        arrLastElem(numbers);
        System.out.println();
        arrFirstElem(numbers2);
        arrLastElem(numbers2);

        System.out.println();
        arrFirstElem(numbers3);
        arrLastElem(numbers3);

        System.out.println();
        arrMidElems(numbers4);
        arrMidElems(numbers5);


    }
}