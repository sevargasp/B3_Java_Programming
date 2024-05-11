package day23_multidimensional_arrays;

import java.util.Arrays;

/*

            Given a 2D array find the average of each inner array
            and extra: average of the whole array

            Ex:

                3, 4, 5, 6
                5, 2, 6
                10, 20, 30

 */
public class AverageOfAge {
    public static void main(String[] args) {
        int [][]nums ={
                {3,4,5,6},
                {5,2,6},
                {10,20,30}
        };

//        int sum=0;//este int afuera, tomara todos los valores, pero solo quiero los de adentro, por eso es que la variable declarada se mueve hacia adentro.
double totalSum=0;//para sacar el average de todos los valores

//        int totalElementosEstiloSergio=0;//esto es solo para contar cuantos hay.
        int totalElem=0;

//OUTERLOOP WILL GET EACH SINGLE DIMENSIONAL ARRAY
        for (int[] eachSingleArray   :nums){//el loop de afuera//0//1//2
            double sum=0;


            //INNER LOOP WILL GET EACH ELEMENT IN SINGLE DIMENSIONAL ARRAY
            for (int eachElem :eachSingleArray){//3,4,5,6//5,2,6//10,20,30
                sum+=eachElem;
                totalSum+=eachElem;
//                totalElementosEstiloSergio++;
            }

            totalElem+=eachSingleArray.length;//esto es para hacerlo dinamico




            System.out.println("Average of: " + Arrays.toString(eachSingleArray)+": -----"+  sum/ eachSingleArray.length);


        }
        System.out.println("totalSum = " + totalSum);
        System.out.println("totalElements = " + totalElem);

        System.out.println("2 Dimensional Array Average general of:) = " + totalSum/totalElem);
    }

}
