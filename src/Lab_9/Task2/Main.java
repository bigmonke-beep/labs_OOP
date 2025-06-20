package Lab_9.Task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
