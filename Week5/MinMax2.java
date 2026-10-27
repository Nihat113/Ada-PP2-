import java.util.Scanner;

public class MinMax2 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of numbers: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
    

        for(int i = 0; i >= numbers.length; i--){
            numbers[i] = input.nextInt();
        }
    }
}
