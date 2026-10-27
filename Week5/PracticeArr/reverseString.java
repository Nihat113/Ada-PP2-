package PracticeArr;

public class reverseString {

    public static String reverString(String text) {
        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverString("Hello"));
    }   
}

