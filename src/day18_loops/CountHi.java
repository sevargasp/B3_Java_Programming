package day18_loops;

public class CountHi {
    public static void main(String[] args) {
        String str= "aaahiahhihibbbcch";  // hi
        int count=0;//          se pone menos 1 aqui porque para que pueda correr la condicion debe ser valida
        for (int index = 0; index < str.length()-1 ; index++) {

            if(str.charAt(index)== 'h'&& str.charAt(index+1)=='i'){
                count++;
            }




        }




    }
}
