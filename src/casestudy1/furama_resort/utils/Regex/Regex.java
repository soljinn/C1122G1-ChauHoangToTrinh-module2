package casestudy1.furama_resort.utils.Regex;

import casestudy1.furama_resort.models.EmployeeModel;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteEmployee;
import casestudy1.furama_resort.utils.UserException.IllegalDateException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    String string;

    public String villaInfo() {
        String REGEX_VILLA = "^(SVVL)-\\d{4}$";
        do {
            string = scanner.nextLine();
            if (string.matches(REGEX_VILLA)) {
                return string;
            } else {
                System.out.println("Try again!");
            }
        } while (true);
    }

    public String roomInfo() {
        String REGEX_ROOM = "^(SVRO)-\\d{4}$";
        do {
            string = scanner.nextLine();
            if (string.matches(REGEX_ROOM)) {
                return string;
            } else {
                System.out.println("Try again!");
            }
        } while (true);
    }

    public String nameInfo() {
        String REGEX_NAME = "^[A-Z][a-z0-9]*$";
        do {
            string = scanner.nextLine();
            if (string.matches(REGEX_NAME)) {
                return string;
            } else {
                System.out.println("Try again!");
            }
        } while (true);
    }

    public static String ageInfo() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        double age;
        String dateOfBirth;
        while (true) {
            try {
                dateOfBirth = getDateFormat();
                age = (double) (date.getTime() - dateFormat.parse(dateOfBirth).getTime()) / 315576E5;
                if (age < 18 || age > 100){
                    System.out.println("User must be at least 18 years old and not more than 100 years old!");
                }
                return dateOfBirth;
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static String getDateFormat() {
        String dateOfBirt;
        while (true) {
            try {
                dateOfBirt = scanner.nextLine();
                if (!dateOfBirt.matches("^(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19|20)\\d{2}$")) {
                    System.out.println("Please enter the correct format dd/MM/yyyy!");
                }
                String[] strings = dateOfBirt.split("/");
                if (strings[1].equals("04") || strings[1].equals("06") || strings[1].equals("09") || strings[1].equals("11")) {
                    if (Integer.parseInt(strings[0]) > 30) {
                        System.out.println("Please enter the correct number of days in the month. This month has only 30 days!");
                    }
                } else if (strings[1].equals("02")) {
                    if (isLeapYear(Integer.parseInt(strings[2]))) {
                        if (Integer.parseInt(strings[0]) > 29){
                            System.out.println("Please enter the correct number of days in February. This month is only 29 days maximum.");
                        }
                    }else {
                        if (Integer.parseInt(strings[0])>28){
                            System.out.println("Please enter the correct number of days in February. This month is only 28 days maximum.");
                        }
                    }
                }
                return dateOfBirt;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean isLeapYear(int year) {
        boolean div4 = year % 4 == 0;
        boolean div100 = year % 100 == 0;
        boolean div400 = year % 400 == 0;
        return (div4 && !div100) || div400;
    }
    public static String getPhone(){
        String phone;
        while (true){
            try {
                phone=scanner.nextLine();
                if (!phone.matches("^0\\d{9}")){
                    System.out.println("Phone numbers consist of 10 digits and start with 0. Please re-enter!");
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return phone;
    }
    public static String getEmail(){
        String email;
        while (true){
            try {
                email = scanner.nextLine();
                if (!email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]{2,}(\\.[A-Za-z0-9]{2,}){1,2}$")){
                    System.out.println("Wrong gmail format. Please re-enter!");
                }
                break;
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return email;
    }
    public static String getIdCard(){
        String idCard;
        while (true){
            try {
                idCard = scanner.nextLine();
                if (!idCard.matches("^\\d{9}|\\d{12}$"));
                System.out.println("Wrong format of CMND/CCCD. Please re-enter!");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
