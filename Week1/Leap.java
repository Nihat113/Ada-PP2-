import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {

        Scanner leap = new Scanner(System.in);

        System.out.print("Please eneter the year: ");
        int year = leap.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");      
    
        }



    
    }
}
