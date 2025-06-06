package Lab_7.Task3;

public class Task3 {
    private String brand;
    private String model;
    private int speed;

    public Task3(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 354;
    }

    public void accelerate(int value) {
        if (value > 0) {
            speed += value;
        }
    }

    public void brake(int value) {
        if (value > 0) {
            speed -= value;
            if (speed < 0) {
                speed = 0;
            }
        }
    }

    public void displayState() {
        System.out.println(brand + " " + model + " їде зі швидкістю " + speed + " км/год");
    }

    public static void main(String[] args) {
        Task3 car = new Task3("Chevrolet", "Camaro");
        car.accelerate(60);
        car.brake(20);
        car.displayState();
    }
}
