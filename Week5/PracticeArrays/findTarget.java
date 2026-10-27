package PracticeArrays;

public class findTarget {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 2, 8, 2, 5, 9};
        int target = 2;

        int numTarget = 0;
        for(int i = 0; i < numbers.length; i = i + 1){

            if (numbers[i] == target) {
                numTarget = numTarget + 1;
            }
        }
        System.out.println("Number of target: " + numTarget);
    }
}
    