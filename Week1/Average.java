import java.util.Scanner;


public class Average {
    public static void main(String[] args) {
        
        Scanner numbers = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        double n = numbers.nextDouble();

        if (n > 0) {

            double sum = 0;
            int total = (int) n;

            while (n > 0) {
                System.out.print("Enter the number: ");
                double num = numbers.nextDouble();
                sum += num;
                n --;
            }
            double average = (double) sum / (double) total;
            System.out.println("The average is: " + average);
        }
        else {
            System.out.println("Please enter a positive number.");
        }


    }
}
