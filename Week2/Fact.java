public class Fact {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Fact <non-negative integer>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }

            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            System.out.printf("%d! = %d%n", number, factorial);
        } catch (NumberFormatException exception) {
            System.out.println("Please provide a valid integer.");
        }
    }
}
