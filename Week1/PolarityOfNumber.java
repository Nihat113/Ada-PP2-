import java.util.Scanner;

class PolarityOfNumber {
    public static void main(String[] args) {

        Scanner polarity = new Scanner(System.in);

        System.out.print("Please write the number: ");
        double a = polarity.nextDouble();

        if (a > 0) {
            System.out.print("This number is positive: " + a);

        }
        else if (a < 0) {
        System.out.println("This number is negative: " + a);
            }
        
        else {
            System.out.println("This number is zero: " +a);
        
        }



    }
}


