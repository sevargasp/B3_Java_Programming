package day33_a_static;

public class Song {

    //INSTANCE VARIABLES
    String name;
    double length;
    String singer;
    String genre;


    public Song (String name){
        this.name = name; // s1.name = name;
    }


    public Song (String name, double length){
        //this.name = name;
        this(name);
        this.length = length;
    }


    public Song (String name, double length, String singer, String genre){

        //this.name = name;
        //this.length = length;
        this(name, length);
        this.singer = singer;
        this.genre = genre;

    }



    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}//yo puedo asignar diferentes variables a otras, pero estar[ia mal
