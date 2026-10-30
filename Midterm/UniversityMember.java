package Midterm;
import java.util.Scanner;

public abstract class UniversityMember {
    private String name;
    private int id;

    public UniversityMember(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public abstract double calculatePayment();

    public void displayInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Please write the number of Students: ");
        int number_student = number.nextInt();

    }
}


class Student extends UniversityMember{
    private double gpa;
    private int completedCredits;

    public Student(String name, int id, double gpa, int completedCredits){
        super(name, id);
        this.gpa = gpa;
        this.completedCredits = completedCredits;
    }

    @Override 
    public double calculatePayment(){
        double payment;
        if (gpa >= 3.5) {
            return payment = 1000.0;
        }
        else{
            return payment = 1500.0;
        }
    }

    public void displayInfo(){
        System.out.println("Student name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Student gpa: " + gpa);
        System.out.println("Student credits: " + completedCredits);
    }
}

class Professor extends UniversityMember{
    private double monthlySalary;
    private int coursesTeaching;

    public Professor(String name, int id, double monthlySalary, int coursesTeaching){
        super(name, id);
        this.monthlySalary = monthlySalary;
        this.coursesTeaching = coursesTeaching;
    }

    public double calculateBonus(){
        int bonus;
        if (coursesTeaching >= 3) {
            return bonus = 500;
        }
        else{
            return bonus = 200;
        }
    }

    public double calculatePayment(){
        return monthlySalary + calculateBonus();
    }
}

