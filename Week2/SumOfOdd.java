import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter valid integers.");
            return;
        }
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter valid integers.");
            return;
        }
        int second = scanner.nextInt();

        int start = Math.min(first, second);
        int end = Math.max(first, second);
        long sum = 0;
        for (int number = start; number <= end; number++) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        System.out.printf("The sum of odd numbers from %d to %d is %d.%n", start, end, sum);
    }
}
