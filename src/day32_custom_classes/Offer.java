package day32_custom_classes;

/*
    create a class called Offer

    - data:

        location, company, salary, is full time, number of PTO
*/
/*
    - constructor

        - create a constructor that creates an Offer object with the company and location

        - create a constructor that creates an Offer object with the company, location, and salary

        - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

*/
/*
    - method:

        toString()
            print all the employees information

 */
public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;


    public Offer (String company, String location) {
        this.company = company;
        this.location = location;
    }

    // OVERLOADED CONSTRUCTOR
    public Offer (String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    @Override
    public String toString() {//esto es para imprimir solo una parte, se toman las cosas en comun y se empieza a crear un statement.

        String info = company + " is located in " + location;

        info += "\n" + (salary > 0 ? salary : "");

        info += "\n" + (isFullTime ? "Full Time" : "Contract");

        info += "\n" + (numberOfPTO > 0 ? numberOfPTO : "");


//        return "Offer{" +
//                "location='" + location + '\'' +
//                ", company='" + company + '\'' +
//                ", salary=" + salary +
//                ", isFullTime=" + isFullTime +
//                ", numberOfPTO=" + numberOfPTO +
//                '}';

        return info;
    }
}