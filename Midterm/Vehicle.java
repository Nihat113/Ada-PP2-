package Midterm;

public abstract class Vehicle {
    public abstract void start();

    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle moto = new Motorcycle();

        car.start();
        moto.start();
        
    }
}

class Car extends Vehicle{

    public void start(){
        System.out.println("Car engine started");
    }
}

class Motorcycle extends Vehicle{

    public void start(){
        System.out.println("Motorcycle engine started");
    } 
}


