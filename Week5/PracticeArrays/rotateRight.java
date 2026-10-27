package PracticeArrays;

public class rotateRight {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = new int[numbers.length];

        result[0] = numbers[numbers.length-1];
        for(int i = 1; i < numbers.length; i++){
            result[i] = numbers[i-1];
        }

        // Your logic here

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
