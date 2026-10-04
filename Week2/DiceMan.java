import java.util.Scanner;
import java.util.Random;

public class DiceMan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (true) {

            System.out.print("Guess a number (2-12, 0 to quit): ");
            int guess = sc.nextInt();

            if (guess == 0) {
                System.out.println("Game Over!");
                break;
            }

            if (guess < 2 || guess > 12) {
                System.out.println("Impossible! Two dice can only make 2 to 12.");
                continue;
            }

            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            int sum = dice1 + dice2;

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Total: " + sum);

            if (guess == sum) {
                System.out.println("You Win!");
            } else {
                System.out.println("Computer Wins!");
            }

            System.out.println();
        }

        sc.close();
    }
}

        





