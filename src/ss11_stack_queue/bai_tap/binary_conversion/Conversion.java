package ss11_stack_queue.bai_tap.binary_conversion;

import java.util.Scanner;
import java.util.Stack;

public class Conversion {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to convert: ");
        int num = scanner.nextInt();

        while (num>0){
            integerStack.push(num%2);
            num = num/2;
        }
        System.out.println("Conversion results: ");
        while (!integerStack.isEmpty()){
            System.out.print(integerStack.pop());
        }
    }
}
