package day05_Variables;

public class CharExamples {
    public static void main(String[]args){

        //declare and assign value to char datatypevariable
        char letterOne= 'a';
        char letterTwo= 'Z';
        char letterThree='9';
        char letterFour= '%';
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);

        System.out.println(letterOne+ letterTwo); // aZ,what we are doing here is taking the values from the ASCII,
        //so aZ ---> 97+ 90 =187
        char letter =74; //J
        System.out.println(letter);

        //Char letter2='75' This is invalid because of the single quiotes

        System.out.println(letterOne+letterTwo+letterThree +letterFour); //97+90+57+37
        System.out.println(letterOne+ " " +letterTwo+" " + letterThree+ " " +letterFour);//

        System.out.println(""+ letterOne+letterTwo+letterThree +letterFour);



    }
}
