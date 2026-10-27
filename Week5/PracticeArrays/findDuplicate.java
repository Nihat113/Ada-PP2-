package PracticeArrays;

public class findDuplicate {

    public static void main(String[] args){
        int[] numbers = {4, 7, 2, 7, 9, 4, 5};

        int dup; 
        for(int i = 0; i < numbers.length; i = i + 1){

            for(int j = i + 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]) {
                    dup = numbers[i];
                    System.out.println(dup + " ");
                    break;
                }
            }
        }
    }
}
