import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one integer, or two integers for a range: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            return;
        }
        int first = scanner.nextInt();

        if (!scanner.hasNextInt()) {
            System.out.printf("%d is %san Armstrong number.%n", first,
                    isArmstrong(first) ? "" : "not ");
            return;
        }

        int second = scanner.nextInt();
        int start = Math.min(first, second);
        int end = Math.max(first, second);
        System.out.printf("Armstrong numbers from %d to %d:%n", start, end);
        boolean found = false;
        for (int number = start; number <= end; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }

    private static boolean isArmstrong(int number) {
        if (number < 0) {
            return false;
        }
        int digits = String.valueOf(number).length();
        int original = number;
        long sum = 0;

        do {
            int digit = number % 10;
            sum += (long) Math.pow(digit, digits);
            number /= 10;
        } while (number > 0);

        return sum == original;
    }
}
