package ss13.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i =0; i< size;i++){
            System.out.println("arr[ "+i+" ]");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(arr));
    }
    public static int  binarySearch(int[] array, int left, int right ,int value){
        if (left > right){
            return -1;
        }
        int middle = (left + right)/2;
        if (array[middle] == value){
            return middle;
        }
        if (array[middle] > value){
            return binarySearch(array, middle + 1, right, value);
        }
        return binarySearch(array, left, middle-1,value);
    }
}
