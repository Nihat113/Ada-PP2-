package PracticeArrays;

public class findReverse {
    
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 1, 9};
        int[] reverse = new int[numbers.length];

        for(int i = 0; i < numbers.length; i = i + 1){
            reverse[i] = numbers[numbers.length - 1 -i];
        }
        for(int i = 0; i < reverse.length; i = i + 1){
            System.out.print(reverse[i] + " ");
        }

    }
}
