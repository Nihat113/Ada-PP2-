class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    
    void sound() {
        System.out.println("Dog");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();

        a1.sound();
        d1.sound();
    }
}