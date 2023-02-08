package ss19;

import java.util.Scanner;

public class ValidateNameClass {
    private static final String REGEX_NAME = "^(C|A|P)+(\\d{4})(G|H|I|K|M+)*$";

    public static void main(String[] args) {
        System.out.println("Nhập tên lớp học");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name.matches(REGEX_NAME));
    }
}
