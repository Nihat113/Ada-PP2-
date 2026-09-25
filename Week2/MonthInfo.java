import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a whole number from 1 to 12.");
            return;
        }

        int month = scanner.nextInt();
        String name;
        int days;

        switch (month) {
            case 1: name = "January"; days = 31; break;
            case 2: name = "February"; days = 28; break;
            case 3: name = "March"; days = 31; break;
            case 4: name = "April"; days = 30; break;
            case 5: name = "May"; days = 31; break;
            case 6: name = "June"; days = 30; break;
            case 7: name = "July"; days = 31; break;
            case 8: name = "August"; days = 31; break;
            case 9: name = "September"; days = 30; break;
            case 10: name = "October"; days = 31; break;
            case 11: name = "November"; days = 30; break;
            case 12: name = "December"; days = 31; break;
            default:
                System.out.println("Invalid month number.");
                return;
        }

        System.out.printf("%s has %d days.%n", name, days);
    }
}
