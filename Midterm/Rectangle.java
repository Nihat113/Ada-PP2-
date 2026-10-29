package Midterm;

public class Rectangle {
    private double width;
    private double height;

    // Constructor 1
    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    // Constructor 2
    public Rectangle(double side) {
        width = side;
        height = side;
    }

    // Constructor 3
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate area
    public double calculateArea() {
        return width * height;
    }

    // Calculate perimeter
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0);
        Rectangle r3 = new Rectangle(4.0, 6.0);

        System.out.println("R1 Area: " + r1.calculateArea());
        System.out.println("R1 Perimeter: " + r1.calculatePerimeter());

        System.out.println("R2 Area: " + r2.calculateArea());
        System.out.println("R2 Perimeter: " + r2.calculatePerimeter());

        System.out.println("R3 Area: " + r3.calculateArea());
        System.out.println("R3 Perimeter: " + r3.calculatePerimeter());
    }
}