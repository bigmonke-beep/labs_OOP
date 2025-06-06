package Lab_6.Task2;

public class Task2 {
    static String brand = "Toyota";
    static String model = "Supra";
    static int speed = 50;

    public static void main(String[] args) {
        accelerate();
        printCar();
    }

    static void accelerate() {
        speed += 1250;
    }

    static void printCar() {
        System.out.println("Авто: " + brand + " " + model + ", швидкість: " + speed);
    }
}