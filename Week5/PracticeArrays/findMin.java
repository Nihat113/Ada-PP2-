package PracticeArrays;

public class findMin {
    public static void main(String[] args) {
        int[] numbers = {14, 6, 23, 2, 17, 9};


        int min = numbers[0];
        for(int i = 0; i < numbers.length; i = i + 1){

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Min number of array: " + min);
    }
}