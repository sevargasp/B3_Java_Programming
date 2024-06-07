package day35_inheritance.computer;

public class Mac extends Computer {

    String safariVersion;

    public Mac(String os, int memory) {
        //super();
        super(os, memory);
        //super.os = os;
        //super.memory = memory;
    }

    public Mac (String os, int memory, String safariVersion) {
        super(os, memory);
        this.safariVersion = safariVersion;
    }

}