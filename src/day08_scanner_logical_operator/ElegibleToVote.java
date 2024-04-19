package day08_scanner_logical_operator;
/*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote
    if they are a citizen, have no criminal background and are about age 18

    print : $name is eligible to vote: $boolean

 */
public class ElegibleToVote {public static void main (String[]args){
    String name = "Tom Jerry";
    boolean isCitizen= true;
    boolean hasCriminal= false;
    int age= 49;

    boolean isElegible1= age >=18 && isCitizen && hasCriminal;
    //                  true     &&  true      && false
    //                          true        && false
    //                                  false

    System.out.println(name+ " is elegible to vote "+isElegible1);

    name = "Vinnie Pooh";
    isCitizen=true;
    hasCriminal=true;

    boolean isElegible2= age >=18 && isCitizen && !hasCriminal;
    //                  true     &&  true      && !true
    //                          true        && false
    //                                  false



}
}
