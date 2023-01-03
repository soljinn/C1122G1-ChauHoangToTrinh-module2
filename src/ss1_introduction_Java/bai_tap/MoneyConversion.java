package ss1_introduction_Java.bai_tap;

import java.util.Scanner;

public class MoneyConversion {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input money USD");
        usd = Double.parseDouble(scanner.nextLine());
        double Vnd = usd * 23000;
        System.out.println("Value VND: " + Vnd);
    }
}
