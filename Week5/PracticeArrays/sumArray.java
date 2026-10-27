package PracticeArrays;

public class sumArray {

    public static void main(String[] args){
        int[] numbers = {3, 6, 2, 8, 1};

        int sum = 0;

        for(int i = 0; i < numbers.length; i = i + 1){
            sum = sum + numbers[i];
        }
        System.out.println("The Sum of the arrays: " + sum);

    }
}