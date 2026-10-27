
public class Student {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.setFirstName("Nihat");
        s.setLastName("Shukurov");

        System.out.println(s.getFirstName());
        System.out.println(s.getLastName());
    }
}
