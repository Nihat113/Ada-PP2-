import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x in radians: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid value for x.");
            return;
        }
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a positive whole number of terms.");
            return;
        }
        int terms = scanner.nextInt();
        if (terms <= 0) {
            System.out.println("The number of terms must be positive.");
            return;
        }

        double estimate = 0;
        double term = x;
        for (int i = 0; i < terms; i++) {
            estimate += term;
            term *= -x * x / ((2.0 * i + 2) * (2.0 * i + 3));
        }

        System.out.printf("Taylor series estimate: %.12f%n", estimate);
        System.out.printf("Math.sin(x):           %.12f%n", Math.sin(x));
    }
}
