package ss3_array_method.bai_tap;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String string = scanner.nextLine();
        System.out.println("Enter the desired character");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("The number of occurrences of " + character + " is " + count);
    }
}
