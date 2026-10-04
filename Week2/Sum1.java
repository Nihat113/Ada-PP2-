import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Please enter the number1: ");
        int a = number.nextInt();

        System.out.print("Please enter the number1: ");
        int b = number.nextInt();

        int sum = a+b;
        System.out.print("Sum of the these two numbers are "+ sum);


    }
}