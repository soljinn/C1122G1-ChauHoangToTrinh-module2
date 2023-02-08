package ss19;

import java.util.Scanner;

public class ValidNumberPhone {
    private static final String REGEX_PHONE = "^[(][0-9]{2}[)][-][(](0)[0-9]{9}[)]$";

    public static void main(String[] args) {
        System.out.println("Nhập số điện: ");
        Scanner scanner = new Scanner(System.in);
        String numPhone = scanner.nextLine();
        System.out.println(numPhone.matches(REGEX_PHONE));
        //làm thêm:
        boolean valid1, valid2, valid3, valid4, valid5;
        valid1 = numPhone.matches(REGEX_VIETTEL);
        valid2 = numPhone.matches(REGEX_MOBI);
        valid3 = numPhone.matches(REGEX_VINA);
        valid4 = numPhone.matches(REGEX_VIETNAMOBILE);
        valid5 = numPhone.matches(REGEX_GMOBILE);
        if (valid1 || valid2 || valid3 || valid4 || valid5 == true) {
            System.out.println("Phone number valid ");
        } else System.out.println("Phone number invalid");
    }

    private static final String REGEX_VIETTEL = "^((\\+|84)|0)+(3)+(2|3|4|5|6|7|8|9)+\\d{7}$";
    private static final String REGEX_MOBI = "^((\\+|84)|0)+(7)+(0|6|7|8|9)+\\d{7}$";
    private static final String REGEX_VINA = "^((\\+|84)|0)+(8)+(1|2|3|4|5)+\\d{7}$";
    private static final String REGEX_VIETNAMOBILE = "^((\\+|84)|0)+(5)+(6|8)+\\d{7}$";
    private static final String REGEX_GMOBILE = "^((\\+|84)|0)+(59)+\\d{7}$";

}

