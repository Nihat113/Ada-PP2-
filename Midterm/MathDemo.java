package Midterm;

public class MathDemo{

    public static void min(int a, int b){
        int min;
        if (a > b) {
            min = b;
        }
        else{
            min = a;
        }
        System.out.println("Small number: " + min);
    }

    public static void max(int a, int b){
        int max;
        if (a > b) {
            max = a;
        }
        else{
            max = b;
        }
        System.out.println("Small number: " + max);
    }

    public static int sum(int[] args){
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum = sum + args[i];
        }
        return sum;
    }

    public static void factorial(int n){
        int fac = 1;
        for(int i = 1; i <= n; i++){
            fac = fac * i;
        }
        System.out.println("Factorial of number: " + fac);
    }


    public static void main(String[] args) {
        min(5, 7);
        max(45, 56);
        factorial(6);
    }
}