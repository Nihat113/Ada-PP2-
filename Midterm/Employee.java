package Midterm;

public abstract class Employee {
    private String name;

    public abstract double calculateSalary();

    public Employee(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Ali", 2500);

        System.out.println("Employee: " + emp.getName());
        System.out.println("Annual salary: " + emp.calculateSalary());
    }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;
    
    public FullTimeEmployee(String name, double montlySalary){
        this.monthlySalary = montlySalary;
        super(name);
    }

    @Override
    public double calculateSalary() {
        return monthlySalary * 12;
    }
}