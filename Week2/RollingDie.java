public class RollingDie {
    public static void main(String[] args) {
        double random = Math.random();
        int result;

        if (random < 0.125) {
            result = 1;
        } else if (random < 0.25) {
            result = 2;
        } else if (random < 0.375) {
            result = 3;
        } else if (random < 0.5) {
            result = 4;
        } else if (random < 0.75) {
            result = 5;
        } else {
            result = 6;
        }

        System.out.println("The loaded die rolled: " + result);
    }
}
