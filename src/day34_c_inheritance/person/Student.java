package day34_c_inheritance.person;

public class Student extends Person {

    boolean isHappy;

    public void study () {
        System.out.println(name + " is studying");//para poder crear la relacion debo usar el keyword extends
    }

}

// Student is-A Person
// Student is Sub Class / Child Class /  Derived CLass
// Person is Super Class / Parent Class / Base Class