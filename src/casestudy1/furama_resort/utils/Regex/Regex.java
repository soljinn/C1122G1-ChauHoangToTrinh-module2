package casestudy1.furama_resort.utils.Regex;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    String string;
    public String villaInfo(){
      String REGEX_VILLA = "^(SVVL)-\\d{4}$";
        do {
            string = scanner.nextLine();
            if (string.matches(REGEX_VILLA)){
                return string;
            }else {
                System.out.println("Try again!");
            }
        }while (true);
    }
    public String roomInfo(){
        String REGEX_ROOM = "^(SVRO)-\\d{4}$";
        do {
            string = scanner.nextLine();
            if (string.matches(REGEX_ROOM)){
                return string;
            }else {
                System.out.println("Try again!");
            }
        }while (true);
    }
    public String nameInfo(){
        String REGEX_NAME = "^[A-Z][a-z0-9]*$";
        do {
            string = scanner.nextLine();
            if (string.matches(REGEX_NAME)){
                return string;
            }else {
                System.out.println("Try again!");
            }
        }while (true);
    }

}
