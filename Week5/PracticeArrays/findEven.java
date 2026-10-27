package PracticeArrays;

public class findEven {
    
    public static void main(String[] args) {
        int[] numbers = {4, 7, 10, 3, 8, 11, 6};

        int even = 0;
        for(int i = 0; i < numbers.length; i = i +1){

            if (numbers[i] % 2 == 0) {
                even = even + 1;
            }
        }
        System.out.println("Count of even numbers: " + even);
    }
}
