package day26_methods;

import java.util.Arrays;

public class AddElemInArr {
    public static void main(String[] args) {
        int [] a = {1,2,3};

        //create a method that accepts int [] and a number and returns an int with element in it
        System.out.println(Arrays.toString(addElemInArr(a, 5)));
        int []b=(addElemInArr(a, 5));

        System.out.println(addElemInArr(b, 943));//memory location

        System.out.println(Arrays.toString(addElemInArr(b,943)));

        System.out.println(Arrays.toString(addElemInArr2(b,943)));

        System.out.println(Arrays.toString(twoArraysInOne(a,b)));



    }
public static int []     addElemInArr(int []originArr, int elemToAdd){

int [] newArray= Arrays.copyOf(originArr,originArr.length+1);

newArray[newArray.length-1]=elemToAdd;

return newArray;
}
//he wants to overload the method
    public static int [] addElemInArr2 (int []originArr, int elemToAdd) {

int []newArray = new int[originArr.length+1];
        for (int i = 0; i < originArr.length; i++) {
            newArray[i]=originArr[i];

        }
        newArray[newArray.length-1]=elemToAdd;


        return newArray;



    }

    public static int [] twoArraysInOne(int []a, int []b){
        int []c= Arrays.copyOf(a,(a.length+ b.length));
        System.out.println(Arrays.toString(c));

        for (int i =0 ; i < b.length ; i++) {
            c[i+ a.length]=b[i];

        }
        System.out.println(Arrays.toString(c));
return c;
    }//esta el metodo escondido



}
