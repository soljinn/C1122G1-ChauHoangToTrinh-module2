package ss2_loop.bai_tap;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        int n = 2;
        for (n = 2; n < 100; n++) {
            boolean kt = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    kt = false;
                    break;
                }
            }
            if (kt) {
                System.out.println(n);
            }
        }
    }
}
