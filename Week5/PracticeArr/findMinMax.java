package PracticeArr;

public class findMinMax {

    public static int findMin(int[] a){

        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if (min > a[i] ) {
                min = a[i];
            }
        }
        return min;
    }
    
    public static int findMax(int[] a) {
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if (max < a[i] ) {
                max = a[i];
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int a[] = { -45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0};

        System.out.println(" Min number of given array: " + findMin(a));
        System.out.println(" Max number of given array: " + findMax(a));

    }
}
