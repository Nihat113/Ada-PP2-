package Midterm;

public abstract class Shape {

    public abstract double calculateArea();

    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.println("Area: " + s.calculateArea());
    }

}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


