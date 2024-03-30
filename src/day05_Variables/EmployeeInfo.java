package day05_Variables;
/*
    create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are they full time, job title, salary, number of pto (0-25), are they married, suite(char - A, B, C, D)

    Print all the variables
 */
public class EmployeeInfo {
    public static void  main(String[]args){
        //declare variables

        //I can separate like: String firstName, lastname, companyName,jobTitle;

        String firstName;
        String lastName;
        String companyName;
        String jobTitle;

        int age;
        int pto; //paid time off
        double salary;

        boolean isFullTime;



        boolean isMarried;
        char suite;
        char gender;

        firstName= "Sergio";
        lastName="Vargas";
        companyName= "Loopcamp";
        jobTitle="Teacher";
        age=31;
        pto=21;
        salary= 120_000.00;
        isFullTime= true;
        isMarried=false;
        suite='A';
        gender ='M';

        String fullDetail="Employment Information for: "+ firstName;



    }
}
