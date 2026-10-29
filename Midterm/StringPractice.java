
package Midterm;

public class StringPractice {
    String text = "Hello Java";

    public StringPractice(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static void main(String[] args) {
        StringPractice sp = new StringPractice("Hello Java");

        System.out.println(sp.getText());
        System.out.println(sp.getText().length());
        System.out.println(sp.getText().charAt(0));
        System.out.println(sp.getText().charAt(sp.getText().length() - 1));
        System.out.println(sp.getText().toUpperCase());
        System.out.println(sp.getText().toLowerCase());
    }
}
