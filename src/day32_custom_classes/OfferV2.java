package day32_custom_classes;

public class OfferV2 {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;


    public OfferV2 (String company, String location) {
        this.company = company;
        this.location = location;
    }

    // OVERLOADED CONSTRUCTOR
    public OfferV2 (String company, String location, double salary) {
        this(company, location);
        this.salary = salary;
    }

    // OVERLOADED CONSTRUCTOR
    public OfferV2(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }


    // BAD CONSTRUCTOR CHAINING EXAMPLE
    // ASSIGNING WRONG VALUES TO WRONG INSTANCE VARIABLES
    public OfferV2(String location, String company, double salary, boolean isFullTime, int numberOfPTO, String name, String lastName) {
        this(name, lastName); // NOT GOOD PRACTICE. WRONG ASSIGNING
        // por ejemplo si creo un this(name, location ),y los llamo por sintaxys esta bien, pero por logica no, ya que no tengo ninngun constructor con esas 2 varibales, las unicas que tengo es con company y location.
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    @Override
    public String toString() {

        String info = company + " is located in " + location;

        info += "\n" + (salary > 0 ? salary : "");

        info += "\n" + (isFullTime ? "Full Time" : "");

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

//cuando se llaman los this() deben estar en el orden del constructor, de otro modo, no se pueden llamar.

