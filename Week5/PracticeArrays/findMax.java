package PracticeArrays;


public class findMax{

    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, 9, 18};

        int max = numbers[0];
        for(int i = 0; i < numbers.length; i = i + 1){

            if (numbers[i] >= max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number od current array; " + max);
    }

}