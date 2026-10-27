package PracticeArr;

public class histogram {



    public static void main(String[] args) {
        int[] grades = {7, 8, 7, 10, 5, 8, 7, 5};
        int[] histogram =new int[11];

        for (int i = 0; i < grades.length; i++) {
            histogram[grades[i]]++;
        }

        
        for (int i = 0; i < histogram.length; i++) {
            System.out.println("Grade " + i + ": " + histogram[i] + " students");
        }

        

 
    }
}
