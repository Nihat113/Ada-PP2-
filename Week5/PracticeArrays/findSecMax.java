package PracticeArrays;

public class findSecMax {
    
    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, 9, 18};

        int max = numbers[0];
        int secmax = numbers[0];

        for(int i = 0; i < numbers.length; i = i + 1){
  
            if (numbers[i] > max){  
                secmax = max;
                max = numbers[i];  
            }
            else if (numbers[i] > secmax && numbers[i] < max) {
                secmax = numbers[i];
            }      
        }
        System.out.println("Second max number: " + secmax);


        
    }
}
