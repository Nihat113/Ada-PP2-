package Week3.practice;

public class Student {
    //variables
    private String name;
    private int age;
    private String major;

    //constructor
    public Student(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    
    }

    public String getName(){
        return name;

    }

    public int getAge(){
        return age;
    }




    public void displayInfo(){

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Major is " + major);

    }


    public static void main(String[] args) {
        Student s1 = new Student("Nihat", 20, "IT");

        s1.getName();
        s1.getAge();
        s1.displayInfo();
    }

}
