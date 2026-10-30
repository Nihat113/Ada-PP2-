package Midterm;

public class StringExercise2 {
    
    public static void main(String[] args) {
        String text = "I love Java Programming";

        System.out.println(text.substring(7,11));
        System.out.println(text.indexOf("Programming"));
        System.out.println(text.replace("Java", "Python"));
        System.out.println(text.substring(0,7));
        System.out.println(text.contains("Python"));

    }
}
