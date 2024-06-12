package day32_custom_classes;

public class EmployeeV2 {
    // These are instance variables that each object of Class Employee will have its own copy.
    String name;
    int id;
    String jobTitle;
    double salary;


    public EmployeeV2 (String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }


    // OVERLOADED CONSTRUCTOR
    public EmployeeV2 (String name, String jobTitle, int id, double salary) {
//        this.name = name;
//        this.jobTitle = jobTitle;
        this(name, jobTitle);
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