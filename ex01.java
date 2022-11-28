package hw01;

public class ex01 {
    public static void main(String[] args) {
        System.out.println(showTotalAmount(15));
        System.out.println(factorial(4));
    }

    public static String showTotalAmount(int n) {
        int result = n * (n + 1) / 2;
        return String.valueOf(result);
    }

    static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
}