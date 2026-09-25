import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.println("Enter numbers separated by spaces, then signal EOF to finish.");
        while (scanner.hasNext()) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input: " + scanner.next());
                return;
            }
            sum += scanner.nextDouble();
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.printf("Average: %.2f%n", sum / count);
        }
    }
}
