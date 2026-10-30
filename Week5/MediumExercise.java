
import java.util.Scanner;

public class MediumExercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.print("Size must be positive.");
            input.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.print("Enter " + size + " numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Maximum: " + findMax(numbers));

        input.close();
    }

    static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

