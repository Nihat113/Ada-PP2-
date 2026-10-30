package Midterm;

public class Person{
    private String name;
    private int age;

    //Comstructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Method
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Nihat", 20);
        UniversityMember s1 = new UniversityMember("Faiq", 23, 123, 3.8);
        UniversityMember s2 = new UniversityMember("Salam", 25, 124, 3.1);

        s1.updateGpa(3.2);
        System.out.println("Yeni gpa: " + s1.getGpa());
        s1.updateGpa(3.4, "Salamm");
        s1.getGpa();
        System.out.println("Yeni gpa: " + s1.getGpa());

    }

}

class Student extends Person{
    private int studentId;
    private double gpa;

    public Student(String name, int age, int studentId, double gpa){
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public int getStudentId(){
        return studentId;
    }

    public double getGpa(){
        return gpa;
    }


    //Method
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getStudentId());
        System.out.println(" Gpa: " + getGpa());
    }

    public boolean isHonorStudent(){
        return gpa>=3.5;
    }

    //Overloading
    public void updateGpa(double newGpa){
        this.gpa = newGpa;
    }
    public void updateGpa(double newGpa, String reason){
        this.gpa = newGpa;
        System.out.println("GPA updated: " + reason);
    }


}



