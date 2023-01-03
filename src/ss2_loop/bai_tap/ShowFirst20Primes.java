package ss2_loop.bai_tap;

import java.util.Scanner;

public class ShowFirst20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = scanner.nextInt();
        int number = 3;
        int count = 1;
        if (n >= 1) {
            System.out.println(20 + " the first prime number is: ");
            System.out.println(2);
        }
        for (int i = 2; i <= 20; ) {
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    count = 0;
                    break;
                }
            }
            if (count != 0) {
                System.out.println(number);
                i++;
            }
            count = 1;
            number++;
        }
    }
}
