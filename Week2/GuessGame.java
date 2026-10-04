import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the maximum number: ");
        int A = sc.nextInt();

        int secret = rand.nextInt(A) + 1;
        int attempts = 0;

        System.out.println("Guess the number!");

        while (sc.hasNextInt()) {
            int guess = sc.nextInt();
            attempts++;

            if (guess == secret) {
                System.out.println("You win!");
                System.out.println("Attempts: " + attempts);
                break;
            } else if (guess < secret) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
        }
    }
}