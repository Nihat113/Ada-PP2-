import java.util.Scanner;
import java.util.Random;


public class GuessGame2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Please enter the maxsimum number: ");
        int Number = sc.nextInt();

        int secret = rand.nextInt(Number) + 1;
        int attempts = 0;

        System.out.print("Please guess the number: ");

        while (sc.hasNextInt()) {
            int guess = sc.nextInt();
            attempts ++;

            if (guess == secret) {

                System.out.println("You win!!!!! ");
                System.out.println("Attempts: " + attempts);
            }
            else if (guess < secret) {
                System.out.println("Higher please! ");
            }
            else {
                System.out.println("Lower Please! ");
            }  
        }  
    }
}
