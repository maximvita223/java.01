package hw01;

public class ex03 {
    public static void main(String[] args) {
        System.out.println(sumCalcul(3, 2));
        System.out.println(subtractionCalcul(1, 2));
        System.out.println(multiCalcul(5, 2));
        System.out.println(divideCalcul(5, 2));

    }

    public static double sumCalcul(double a, double b) {
        double sum = a + b;
        return sum;

    }

    public static double subtractionCalcul(double a, double b) {
        double subtraction = a - b;
        return subtraction;

    }

    public static double multiCalcul(double a, double b) {
        double subtraction = a * b;
        return subtraction;

    }

    public static double divideCalcul(double a, double b) {
        double subtraction = a / b;
        return subtraction;

    }
}
