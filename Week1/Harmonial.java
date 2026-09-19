import java.util.Scanner;

public class Harmonial {
    public static void main(String[] args) {

        Scanner harmon = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int n = harmon.nextInt();

        if (n > 0) {

            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += (double) 1 / (double) i;
            }

            System.out.println("The sum of the harmonic series is: " + sum);

        }
        else {
            System.out.println("Please enter a positive number.");
        }




    }
}
