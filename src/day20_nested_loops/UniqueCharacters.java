package day20_nested_loops;

public class UniqueCharacters {
    public static void main (String[]args) {
        String str = "AABCDDFGWOF&#($";
        //Find the only the unique characters

        for (int i = 0; i < str.length(); i++) {//el numero de veces es str.length

            char eachLetter1 = str.charAt(i);//revisar con cada incremento la letra// for option 2puedo usarlo tambien como str.substring(i)--->pero esto imprime hasta el final//str.substring--->(i, i+1)--->este imprime en string no en CHAr
            int count = 0;//lo declaramos aqui, porque lo necesitamos es adentro.


            for (int j = 0; j < str.length(); j++) {

                char eachLetter2 = str.charAt(j); //String eachLetter2=str.substring(j,j+1)
                if (eachLetter1 == eachLetter2) {//eachLetter1.equals(eachLetter2){}si lo hiciera por string
                    count++;

                }


            }
            if(count==1){
                System.out.print(eachLetter1);}

        }
    }
}
