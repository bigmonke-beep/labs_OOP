package Lab_8.Task2;

public class Task2 {
    protected int speed = 0;

    public void showSpeed() {
        System.out.println("Поточна швидкість: " + speed);
    }
}

class Car extends Task2 {
    public void accelerate() {
        speed += 90;
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.accelerate();
        myCar.accelerate();
        myCar.showSpeed();
    }
}
