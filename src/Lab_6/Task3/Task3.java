package Lab_6.Task3;

public class Task3 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Курка", "кококо");
        animals[1] = new Animal("Півень", "кукаріку");
        animals[2] = new Animal("Свиня", "хрюхрю");

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

class Animal {
    String name;
    String sound;

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void makeSound() {
        System.out.println(name + " видає звук: " + sound);
    }
}
