package ss11_stack_queue.bai_tap.check_palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String string;
        boolean check;
        do {
            System.out.println("Enter any string with at least 2 characters: ");
            string = scanner.nextLine();
            check = string.length() < 2;
            if (check) {
                System.out.println("Please re-enter!");
            }
        } while (check);
        String[] stringArr = string.split("");
        System.out.println(Arrays.toString(stringArr));

        for (String str : stringArr) {
            stringStack.push(str.toLowerCase());
            stringQueue.add(str.toLowerCase());
        }

        String str1 = "";
        String str2 = "";
        while (!stringStack.isEmpty() && !stringQueue.isEmpty()) {
            str1 += stringStack.pop();
            str2 += stringQueue.poll();
        }
        if (str1.equals(str2)) {
            System.out.println("The string you just entered is a Palindrome!");
        } else {
            System.out.println("The string entered is not a Palindrome");
        }
    }
}
