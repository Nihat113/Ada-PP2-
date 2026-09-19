import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {

        Scanner fact = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = fact.nextInt();
        int factorial = 1;


        if (number < 0) {
            System.out.println("Sorry, factorail does not exist for negative numbers.");
        }
        else if (number == 0) {
            System.out.println("The factorial of 0 is 1.");
        }
        else {
            while (number > 0) {
                factorial *= number;
                number--;
            }
             System.out.println("This number's factoriral is: " + factorial);
        }
    }
}
