package PracticeArrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 0, 3, 8, 0, 2};

        int[] result = new int[numbers.length];
        int position = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                result[position] = numbers[i];
                position++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}