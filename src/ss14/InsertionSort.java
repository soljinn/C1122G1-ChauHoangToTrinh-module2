package ss14;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the th element: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("the original array is: " + Arrays.toString(array));
        insertionSortByStep(array);
    }

    public static void insertionSortByStep(int[] array) {
        int valueToInsert;
        int pos;
        for (int i = 1; i < array.length; i++) {
            valueToInsert = array[i];
            pos = i;
            while (pos > 0 && valueToInsert < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("Move element : " + array[pos]);
            }
            array[pos] = valueToInsert;
        }
        System.out.println("Array after sorted: " + Arrays.toString(array));
    }
}