package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input element ");
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println("Array[i]= "  + i);
            array.push(scanner.nextInt());
        }
        System.out.println("Original Array:  " + array);
        Stack<Integer> arrayReverse = new Stack<>();
        while (!array.isEmpty()){
            arrayReverse.push(array.pop());
        }
        for (int index:arrayReverse) {
            array.push(index);
        }
        System.out.println("Reverse Array: " + array);
    }
}
