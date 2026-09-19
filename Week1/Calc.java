import java.util.Scanner;

class Calc {
    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

        System.out.print("Write the first number: ");
        int a = calculator.nextInt();

        System.out.print("Please write the second number: ");
        int b = calculator.nextInt();

        int sum = a + b;
        int subcraction = a - b;
        int multible = a*b;
        int devision = a/b;

        System.out.println("The sum is: " + sum);
        System.out.println("The substraction is: " + subcraction);
        System.out.println("The multible is: " + multible);
        System.out.println("The devision is: " + devision);

        System.out.println("Thank you for using the calculator!");


    }   
}