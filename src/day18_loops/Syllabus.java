package day18_loops;
/*
Syllables
    Given a String separated by dashes calculate how many syllables the words are
    Ex:
        Input:
            ja-va
        Output:
            2
 */
public class Syllabus {
    public static void main(String[] args) {
        String str="ja-va";
        int countDash=0;
        for (int index   = 0; index <str.length() ; index++) {if(str.charAt(index)=='-');
            countDash++;
        }
        System.out.println("number of syllabus: "+(countDash+1)/*i need to add +1 because 1 dash means two syllabus*/);

    }
}
