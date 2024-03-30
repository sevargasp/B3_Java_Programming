package day04_variables;

import java.sql.SQLOutput;

/*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
public class School {
    public static void main(String[]args) {

        int numberofstudentsingradeOne = 40;
        int numberofstudentsingradeTwo = 25;
        int numberofstudentsingradeThree = 34;
        int numberofstudentsingradeFour = 19;
        int numberofstudentsingradeFive = 28;

        int totalNumberOfStudents = numberofstudentsingradeOne+numberofstudentsingradeTwo+numberofstudentsingradeThree
                +numberofstudentsingradeFour+numberofstudentsingradeFive;


        double numberOfSchoolDays = 100.5;
        double numberOfSnowDays= 5.5;
        double averageGpaInSchool =3.6;

        System.out.println("Number of students in Grade 1: "+ numberofstudentsingradeOne);
        System.out.println("Number of students in Grade 2: "+ numberofstudentsingradeTwo);
        System.out.println("Number of students in Grade 3: "+ numberofstudentsingradeThree);
        System.out.println("Number of students in Grade 4: "+ numberofstudentsingradeFour);
        System.out.println("Number of students in Grade 5: "+ numberofstudentsingradeFive);
        System.out.println();
        System.out.println("Total number of students: "+totalNumberOfStudents);
        System.out.println();
        System.out.println("Number of school days: "+ numberOfSchoolDays);
        System.out.println("Number of snowdays: "+numberOfSnowDays);
        System.out.println("Average GPA in School: "+averageGpaInSchool);
    }

}
