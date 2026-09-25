import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of seconds: ");

        if (!scanner.hasNextLong()) {
            System.out.println("Please enter a whole number.");
            return;
        }

        long totalSeconds = scanner.nextLong();
        if (totalSeconds < 0) {
            System.out.println("Seconds cannot be negative.");
            return;
        }

        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        System.out.printf("%d seconds = %d hour(s), %d minute(s), %d second(s).%n",
                totalSeconds, hours, minutes, seconds);
    }
}
