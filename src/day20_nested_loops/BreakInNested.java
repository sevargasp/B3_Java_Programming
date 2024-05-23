package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        //OUTER LOOP
        for (int i = 0; i < 5; i++) {

            System.out.println("i: "+ i);

            if(i==3) {
                break;//when ever we are reaching break. the purpose is to end the loop
                //when the above break statement is run we stop the OUTER LOOP}
            } for (int j = 0; j < 2; j++) {
                    System.out.println("j: "+j);}

                }
        }

    }

