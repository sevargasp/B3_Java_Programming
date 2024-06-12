package day32_custom_classes;

/*
  create a class called Employee

   - data:

       name, id, job title, salary

*/

/*

- constructor

    - create a constructor that creates an Employee object with the name and job title

    - create a constructor that creates an Employee object with the name, id, job title, and salary

*/

/*
    - method:

        goToMeeting()
            when this method is called print:
                $name is going to a meeting

        toString()
            print all the employees information

 */
public class Employee {
    // These are instance variables that each object of Class Employee will have its own copy.
    String name;
    int id;
    String jobTitle;
    double salary;


    public Employee (String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }


    // OVERLOADED CONSTRUCTOR
    public Employee (String name, String jobTitle, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }

    // INSTANCE METHOD - does not have "static" keyword
    public void goToMeeting(){
        System.out.println(name + " is going to a meeting.");
    }


    @Override
    public String toString() {
        return name + " - " + jobTitle + " - " + id + " - $" + salary;
    }
}