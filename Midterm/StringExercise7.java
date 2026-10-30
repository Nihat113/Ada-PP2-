package Midterm;

public class StringExercise7 {

    public static String reverse(String text) {

        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        String word = "Java";

        String reversed = reverse(word);

        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversed);
    }
}