package casestudy1.furama_resort.utils.UserException;

import java.util.Scanner;

public class ExceptionCondition {
    final Scanner scanner = new Scanner(System.in);
    public double areaInfo(){
        double area;
        do {
            try{
                area = Double.parseDouble(scanner.nextLine());
                if (area > 30){
                    return area;
                }else {
                    System.out.println("Try again!");
                }
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while (true);
    }
    public double rentInf(){
        double number;
        do {
            try {
                number = Double.parseDouble(scanner.nextLine());
                if (number>0){
                    return number;
                }
                System.out.println("Try aigan!");
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while (true);
    }
    public int numberOfPeople(){
        int number;
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number > 0 && number<20){
                    return number;
                }
                System.out.println("Try again!");
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while (true);
    }
    public int numberOF(){
        int number;
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number>0){
                    return number;
                }
                System.out.println("Try again!");
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while (true);
    }
}
