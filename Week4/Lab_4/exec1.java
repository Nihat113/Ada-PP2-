package Week4.Lab_4;

public class exec1 {

    public static void main(String[] args){

        int[] numbers = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
    }
    
}

