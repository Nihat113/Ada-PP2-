package Week3.practice;

public class StudentGrade {

    private String studentName;
    private int grade;

    // Constructor
    public StudentGrade(String studentName, int grade) {
        this.studentName = studentName;
        this.grade = grade;
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }

    // Check grade
    public String checkGrade() {

        if (grade >= 90 && grade <= 100) {
            return "A";
        }
        else if (grade >= 80 && grade <= 89) {
            return "B";
        }
        else if (grade >= 70 && grade <= 79) {
            return "C";
        }
        else if (grade >= 60 && grade <= 69) {
            return "D";
        }
        else if (grade >= 0 && grade <= 59) {
            return "F";
        }
        else {
            return "Invalid";
        }
    }

    // Display result
    public void displayResult() {

        System.out.println("Student name is " + studentName);
        System.out.println("Student mark is " + grade);
        System.out.println("Student grade is " + checkGrade());
    }

    public static void main(String[] args) {

        StudentGrade s1 = new StudentGrade("Nihat", 78);

        s1.displayResult();
    }
}

