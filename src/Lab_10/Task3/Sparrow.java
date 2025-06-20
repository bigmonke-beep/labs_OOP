package Lab_10.Task3;

public class Sparrow extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Ку-ку-ку , Ку-ку-ку!");
    }

    @Override
    public void fly() {
        System.out.println("Зозуля літає");
    }

}
