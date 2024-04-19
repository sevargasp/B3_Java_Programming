package day12_print_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your browser: ");
        String browserType = input.next();

        switch (browserType){
            case "Chrome":
                System.out.println("Opening google in "+browserType+ " browser");
                break;

            case "Fairfox":
                System.out.println("Opening google in "+browserType+ " browser");
                break;

            case "Safari":
            case "safari"://I can add other options.
                System.out.println("Opening google in "+browserType+ " browser");
                break;

            default:
                System.out.println("we do not have"+browserType+" browser type or it is invalid one");
                break;

        }

    }
}
