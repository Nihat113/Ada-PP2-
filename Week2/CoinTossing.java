import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times should the coin be tossed? ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a positive whole number.");
            return;
        }
        int tosses = scanner.nextInt();
        if (tosses <= 0) {
            System.out.println("The number of tosses must be positive.");
            return;
        }

        int heads = 0;
        for (int i = 0; i < tosses; i++) {
            if (Math.random() < 0.5) {
                heads++;
            }
        }
        int tails = tosses - heads;
        System.out.printf("Heads: %d (%.2f%%)%n", heads, 100.0 * heads / tosses);
        System.out.printf("Tails: %d (%.2f%%)%n", tails, 100.0 * tails / tosses);
    }
}
