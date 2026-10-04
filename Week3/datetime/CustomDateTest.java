package Week3.datetime;

public class CustomDateTest {

    public static void main(String[] args) {

        // Create CustomDate object
        CustomDate date = new CustomDate(10, 2, 2026);

        // GET methods
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());

        // SET methods
        date.setMonth(12);
        date.setDay(25);
        date.setYear(2026);

        // Print changed values
        System.out.println("After changing:");

        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());

        date.displayDate();
        
    }
}