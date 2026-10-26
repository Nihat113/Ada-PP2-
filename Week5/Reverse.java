import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print(" Enter the word: ");
        String word = input.next();

        input.close();

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            
            reversed = reversed + word.charAt(i);

        }

        System.out.println("Reversed String: " + reversed);
    }
}
