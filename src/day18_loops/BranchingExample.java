package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {
        // break;
        // continue;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
//            if (i == 5) {
//                continue;
//            }
    }

        System.out.println("---------ANOHTER EXAMPLE---------");
        for (int i = 0; i <10 ; i++) {
            if(i% 2 == 1){//once you reach this 'Continue", go to the next iteration
                continue;

            }
            System.out.print(i+" ");

        }

}}
