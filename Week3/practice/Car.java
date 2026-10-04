package Week3.practice;

public class Car {

    private String brand;
    private String model;
    private int year;
    private int speed;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    // Accelerate
    public void accelerate() {
        speed = speed + 10;
    }

    // Brake
    public void brake() {
        if (speed >= 10) {
            speed = speed - 10;
        }
        else {
            speed = 0;
        }
    }

    // Display information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed);
        System.out.println();
    }

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", 2024);

        car1.displayInfo();

        car1.accelerate();
        car1.accelerate();

        car1.displayInfo();

        car1.brake();

        car1.displayInfo();

        car1.brake();
        car1.brake();
        car1.brake();

        car1.displayInfo();
    }
}