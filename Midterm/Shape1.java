package Midterm;

public abstract class Shape1 {
    private String name;

    public Shape1(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract double calculateArea();

    public static void main(String[] args) {
        Shape1 s1 = new Circle("Circle", 5);
        Shape1 s2 = new Rectangle("Rectangle", 4, 6);

        System.out.println(s1.getName() + " area: " + s1.calculateArea());
        System.out.println(s2.getName() + " area: " + s2.calculateArea());
    }
}

class Circle extends Shape1{
    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override 
    public double calculateArea(){
        return Math.PI * (radius*radius);
    }
}

class Rectangle extends Shape1{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override 
    public double calculateArea(){
        return width*height;
    }
}

