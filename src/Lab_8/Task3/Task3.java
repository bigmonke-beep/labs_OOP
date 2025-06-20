package Lab_8.Task3;

public class Task3 {
    protected String name;

    public Task3(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Mammal extends Task3 {
    public Mammal(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("Walking...");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Боб");
        dog.walk();
        dog.makeSound();
        System.out.println("Ім'я: " + dog.name);
    }
}
