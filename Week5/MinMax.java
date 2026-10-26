public class MinMax {
    int[] numbers = {8, 5, 6, 2, 1};

    public static int findMin(int[] numbers){

        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int findMax(int[] numbers){
        int max = numbers[0];

        for(int i = 1; 1 < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static void findSum(int[] numbers){
        int sum = findMax(numbers) + findMin(numbers);
        System.out.println("Sum of the max and min numbers: " + sum);

    }


    public static void main(String[] args) {
        int[] numbers = {8, 3, 12, 1, 6};
        System.out.println("Minimum: " + findMin(numbers));
        findSum(numbers);





        
    }
}
