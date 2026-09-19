import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0) {

            if (num1 > num2) {

                int sum = 0;
                for (int i = num2; i <= num1; i++) {
                    if (i % 2 != 0) {
                        sum += i;
                    }
                }
                System.out.println("The sum of odd numbers between " + num2 + " and " + num1 + " is: " + sum);
            } else if (num2 > num1) {
                int sum = 0;
                for (int i = num1; i <= num2; i++) {
                    if (i % 2 != 0) {
                        sum += i;
                    }
                }
                System.out.println("The sum of odd numbers between " + num1 + " and " + num2 + " is: " + sum);
            } else {
                System.out.println("Both numbers are equal. No range to calculate.");

            }

        } else {
            System.out.println("Please enter positive numbers only.");}
        



            


        }
  
    }

