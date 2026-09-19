import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner time = new Scanner(System.in);

        System.out.print("Please write the number in seconds: ");
        int a = time.nextInt();

        float seconds = a;
        float minutes = a / 60;
        float hours = a / 3600;

        System.out.println("This is the version of seconds " + seconds);
        System.out.println("This is the version of minutes " + minutes);
        System.out.println("This is the version of hours " + hours);

        System.out.println("Thank you for using this program");








    }
    
}
