package ss13.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();

        List<Character> max = new ArrayList<>();
        List<Character> list = new ArrayList<>();

        list.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) <= string.charAt(i - 1)) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        System.out.println("Chuỗi được sắp xếp theo thứ tự có độ dài lớn nhất: ");
        for (Character character : max) {
            System.out.print(character);
        }
    }
}
