package PracticeArrays;

public class findEvenOdd {
    public static void main(String[] args){
        int[] numbers = {4, 7, 2, 9, 6, 3, 8};

        int[] even = new int[numbers.length];
        int[] odd = new int[numbers.length];

        int evenPosition = 0;
        int oddPosition = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
                even[evenPosition] = numbers[i];
                evenPosition++;
            }
            else{
                odd[oddPosition] = numbers[i];
                oddPosition++;
            }
        }
        System.out.print("Even: ");
        for(int i = 0; i < evenPosition; i++){
            System.out.print(even[i] + " ");
        }

        System.out.print("Odd: ");
        for(int i = 0; i < oddPosition; i++){
            System.out.print(odd[i] + " ");
        }

    }
}
