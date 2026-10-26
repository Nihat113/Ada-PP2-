

public class GradeManager{

    private int[] grades;

    // Constructor
    public GradeManager(int numberOfStudents) {
        grades = new int[numberOfStudents];
    }

    // Store grades in the array
    public void setGrades() {
        grades[0] = 75;
        grades[1] = 45;
        grades[2] = 90;
        grades[3] = 60;
        grades[4] = 35;
    }

    // Display all grades
    public void displayGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
    }

    // Find the highest grade
    public int findHighest() {
        int highest = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }

        return highest;
    }

    // Calculate the average grade
    public double calculateAverage() {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        return (double) sum / grades.length;
    }

    // Count students who passed
    public int countPassed() {
        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 60) {
                count++;
            }
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {

        GradeManager manager = new GradeManager(5);

        manager.setGrades();

        System.out.println("Student Grades:");
        manager.displayGrades();

        System.out.println("\nHighest Grade: " + manager.findHighest());
        System.out.println("Average Grade: " + manager.calculateAverage());
        System.out.println("Students Passed: " + manager.countPassed());
    }
}


