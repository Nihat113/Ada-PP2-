package Midterm;

public class ArrayAnalyzer {
    
    public static int findMin(int[] numbers){

        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.print("Smallest number inside the array: ");
        return min;
    }

    public static void findMax(int[] numbers){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.print("Smallest number inside the array: " + max);
    }
    
    public static int calculateSum(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static double calculateAverage(int[] numbers){
        double ave;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        ave = sum / (numbers.length - 1);
        return ave;
    }

    public static void countEven(int[] numbers){
        int count = 0;
        for(int i = 0; i < numbers.length; i++){

            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of the even numbers: " + count);
    }
    public static void main(String[] args) {
        int[] numbers = {8, 3, 12, 5, 10, 7};

        findMin(numbers);
        findMax(numbers);
        calculateAverage(numbers);
        calculateSum(numbers);




    }
}
